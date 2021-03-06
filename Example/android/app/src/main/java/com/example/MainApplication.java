package com.example;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.twiliorn.library.TwilioPackage;
import com.facebook.soloader.SoLoader;
import com.twiliorn.library.TwilioPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    // @Override
    // protected List<ReactPackage> getPackages() {
    //   @SuppressWarnings("UnnecessaryLocalVariable")
    //   // List<ReactPackage> packages = new PackageList(this).getPackages();
    //   // packages.add( new MainReactPackage());
    //   // packages.add(new TwilioPackage());
       
    //   return Arrays.<ReactPackage>asList(
    //       new MainReactPackage(),
    //       new TwilioPackage()
    //   );
    //  // return packages;
    // }

     @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new TwilioPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
