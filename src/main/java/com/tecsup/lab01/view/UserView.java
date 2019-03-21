package com.tecsup.lab01.view;

import com.tecsup.lab01.controller.UserController;

public class UserView
{
    public static void main( String[] args )
    {
    	UserController x=new UserController();
    	System.out.println(x.obtenernombre());
    }
}
