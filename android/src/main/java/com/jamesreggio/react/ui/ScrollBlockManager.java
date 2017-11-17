package com.jamesreggio.react.ui;

import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public class ScrollBlockManager extends ViewGroupManager<ScrollBlockView> {

  @Override
  public String getName() {
    return "ScrollBlockView";
  }

  @Override
  public ScrollBlockView createViewInstance(ThemedReactContext context) {
    return new ScrollBlockView(context);
  }

  @ReactProp(name = "blocked")
  public void setBlocked(ScrollBlockView view, boolean blocked) {
    view.setBlocked(blocked);
  }

}
