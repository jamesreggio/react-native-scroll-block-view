import PropTypes from 'prop-types';
import React, {PureComponent} from 'react';
import {requireNativeComponent} from 'react-native';

export default class ScrollBlockView extends PureComponent {
  static propTypes = {
    blocked: PropTypes.bool,
  };

  static defaultProps = {
    blocked: true,
  };

  render() {
    return <NativeScrollBlockView {...this.props} />;
  }
}

const NativeScrollBlockView = requireNativeComponent(
  'ScrollBlockView',
  ScrollBlockView,
);
