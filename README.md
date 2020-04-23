# androidWithFlutter
把flutter module作为aar接入现有安卓工程中混合开发

https://flutter.dev/docs/development/add-to-app/android/project-setup
配置步骤 flutter create -t module ftnkit创建同级model
flutter build aar
 app/build.gradle 配置repositories {
  maven {
    url 'some/path/my_flutter/build/host/outputs/repo'
  }
  maven {
    url 'https://storage.googleapis.com/download.flutter.io'
  }
}

dependencies {
  // ...
  debugImplementation 'com.example.flutter_module:flutter_debug:1.0'
  profileImplementation 'com.example.flutter_module:flutter_profile:1.0'
  releaseImplementation 'com.example.flutter_module:flutter_release:1.0'
}
settings.gradle:添加如下设置
evaluate(new File(                                                      // new
        settingsDir.parentFile,                                               // new
        'my_flutter/.android/include_flutter.groovy'                          // new
))
app的build.gradle中添加依赖implementation project(':flutter')
完成
