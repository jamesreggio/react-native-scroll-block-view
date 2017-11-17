#import "RNScrollBlockView.h"

@implementation RNScrollBlockView

- (id)initWithFrame:(CGRect)frame
{
  if (self = [super initWithFrame:frame]) {
    _blocked = NO;
    _panGestureRecognizer = [[UIPanGestureRecognizer alloc] initWithTarget:self action:@selector(handlePan:)];
    _panGestureRecognizer.enabled = NO;
    [self addGestureRecognizer:_panGestureRecognizer];
  }
  return self;
}

- (void)handlePan:(UIPanGestureRecognizer *)recognizer
{
  // Do nothing.
}

- (void)setBlocked:(BOOL)blocked
{
  _blocked = blocked;
  _panGestureRecognizer.enabled = _blocked;
}

@end
