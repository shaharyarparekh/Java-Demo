package com.example.demo;


import net.bytebuddy.implementation.bind.annotation.AllArguments;



public class APIResponse <T>{
    int RecordCount;
    T Response;
}
