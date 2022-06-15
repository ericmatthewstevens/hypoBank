from flask import Blueprint, render_template, flash

from . import db

views = Blueprint("views", __name__)

@views.route("/home", methods=['GET', 'POST'])
@views.route("/")
def home():
    return render_template("home.html")