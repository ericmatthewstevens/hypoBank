
"""
* An password field to store String values. 
    ***NOTE*** The passwords will be hashed upon creating a new user. 
    * The werkzeug library will use the 'sha256' encryption method. Please refer to 
        https://werkzeug.palletsprojects.com/en/2.1.x/utils/#module-werkzeug.security for more details.

"""
from flask import Blueprint, render_template, redirect, request, url_for, flash
from . import db
from .models import User
from flask_login import login_user, logout_user, login_required, current_user
from werkzeug.security import generate_password_hash, check_password_hash

auth = Blueprint("auth", __name__)

@auth.route("/sign-up", methods=['GET', 'POST'])
def sign_up():
    if request.method == 'POST': 
        # If the request is a 'POST' method, the signup form will collect the email, username, and the same password twice from the user.
        email = request.form.get("email")
        username = request.form.get("username")
        password_one = request.form.get("password_one")
        password_two = request.form.get("password_two")

        """
        If the email and username already exist in the db, notify the user both are already in use.
        """
        email_exists = User.query.filter_by(email=email).first()
        username_exists = User.query.filter_by(username=username).first()

        if email_exists:
            flash('Email is already in use.', category='error')
        elif username_exists:
            flash('Username is already in use.', category='error')
        elif password_one != password_two:
            flash('Password don\'t match!', category='error')
        elif len(username) < 2:
            flash('Username is too short!', category='error')
        elif len(password_one) < 6:
            flash('Password is too short!', category='error')
        elif len(email) < 4:
            flash('Email is invalid', category='error')
        else:
            ### If the there are no discrepancies with the desired credentials, 
            # insert all provided data into the model to be stored into the database as a User model.
            new_user = User(email, username, password=generate_password_hash(password_one, method='sha256'))
            db.session.add(new_user) # New user model is staged
            db.session.commit() # New user model is now added to the DB
            flash("Welcome to HypoBank " + username + "!")
            return redirect(url_for('views.home'))
