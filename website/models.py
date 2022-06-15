"""
The models within this file define a user class within the database.
User models will include columns for the following:
    * A unique identifier, or id, which will assume the role of the primary key.
        This will be an integer value
    * An email address field to store String values. Set the 'unique' argument to a 'True' boolean value.
    * An user name field to store String values. Set the 'unique' argument to a 'True' boolean value.
    * An password field to store String values. 
        ***NOTE*** The passwords will be hashed upon creating a new user. 
        * The werkzeug library will use the 'sha256' encryption method. Please refer to 
          https://werkzeug.palletsprojects.com/en/2.1.x/utils/#module-werkzeug.security for more details.
    
"""

from time import timezone
from flask_login import UserMixin
from . import db
from sqlalchemy.sql import func

class User(db.Model, UserMixin):
    id = db.Column(db.Integer, primary_key = True)
    email = db.Column(db.String(150), unique = True)
    username = db.Column(db.String(150), unique = True)
    password = db.Column(db.String(150))
    date_created = db.Column(db.DateTime(timezone=True), default=func.now())
