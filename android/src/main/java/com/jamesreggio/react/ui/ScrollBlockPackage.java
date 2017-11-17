package com.jamesreggio.react.ui;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScrollBlockPackage implements ReactPackage {

  @Override
  public List<ViewManager> createViewManagers(final ReactApplicationContext context) {
    List<ViewManager> managers = new ArrayList<>();
    managers.add(new ScrollBlockManager());
    return managers;
  }

  @Override
  public List<NativeModule> createNativeModules(final ReactApplicationContext context) {
    return Collections.emptyList();
  }

}
