package com.jamesreggio.react.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;

import com.facebook.react.views.view.ReactViewGroup;

public class ScrollBlockView extends ReactViewGroup {

  private boolean blocked = false;

  public ScrollBlockView(final Context context) {
    super(context);
  }

  public void setBlocked(boolean blocked) {
    this.blocked = blocked;
  }

  @Override
  public boolean onInterceptTouchEvent(MotionEvent event) {
    if (!this.blocked) {
      return super.onInterceptTouchEvent(event);
    }

    final ViewParent parent = this.getParent();

    if (parent != null) {
      parent.requestDisallowInterceptTouchEvent(true);
    }

    return false;
  }

  @Override
  public boolean onTouchEvent(MotionEvent event) {
    if (!this.blocked) {
      return super.onTouchEvent(event);
    }

    return true;
  }

}
