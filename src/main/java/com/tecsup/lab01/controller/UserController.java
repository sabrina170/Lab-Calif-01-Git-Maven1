package com.tecsup.lab01.controller;

import com.tecsup.lab01.model.UserModel;

public class UserController extends UserModel{
	
   public String obtenernombre() {
	   return nombre + " "+ Apellido+ " " + edad;
   }
	
}
