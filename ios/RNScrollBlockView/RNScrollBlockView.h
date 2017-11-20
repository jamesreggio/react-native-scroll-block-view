#import <UIKit/UIKit.h>
#import <React/RCTView.h>

@interface RNScrollBlockView : RCTView

@property (nonatomic, assign) BOOL blocked;
@property (nonatomic, strong) UIPanGestureRecognizer *panGestureRecognizer;

@end
