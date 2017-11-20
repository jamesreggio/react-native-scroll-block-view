#import "RNScrollBlockView.h"
#import <React/RCTViewManager.h>

@interface RNScrollBlockViewManager: RCTViewManager
@end

@implementation RNScrollBlockViewManager

RCT_EXPORT_MODULE(ScrollBlockView)

RCT_EXPORT_VIEW_PROPERTY(blocked, BOOL)

- (UIView *)view
{
  return [[RNScrollBlockView alloc] init];
}

@end
