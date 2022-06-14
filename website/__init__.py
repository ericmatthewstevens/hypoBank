from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from os import path
from flask_login import LoginManager
from werkzeug.security import generate_password_hash, check_password_hash

db = SQLAlchemy() ## This application will utilize SQLAlchemy in order to initialize a SQLite db
DB_NAME = "database.db" ## The database will be stored in the file named database.db.
                        ## It is imperative that this file is consistently refreshed throughout development in order for models to stay consistent.

def create_app():
    app = Flask(__name__)
    app.config['SECRET_KEY'] = 'fordevuseonly' ##FOR DEVELOPMENT USE ONLY!!! NEVER LET PASSWORDS GO UNHASHED. Refer to werkzeug.security docs!!!
    app.config['SQLALCHEMY_DATABASE_URI'] = f'sqlite:///{DB_NAME}'
    db.init_app(app)

    login_manager = LoginManager() # LoginManager is used to differentiate between users that are(n't) logged into an account
    login_manager.login_view = "auth.login" # If the user is not logged in, redirect them to "auth.login" (the login page)
    login_manager.init_app(app)

    create_database(app)

    return app

def create_database(app):
    if not path.exists("website/" + DB_NAME):
        db.create_all(app=app)
        print("SQLite database created!")