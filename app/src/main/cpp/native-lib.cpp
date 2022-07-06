#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_mrmansur_securingkeysusingcmake_MainActivity_getPublicKey(JNIEnv *env, jobject object) {
//    return (*env)->  NewStringUTF(env, "long_public_key");
    std::string hello = "Hello from Jni";
    return env->NewStringUTF(hello.c_str());
}