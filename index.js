import PropTypes from 'prop-types';
import React, {PureComponent} from 'react';
import {View, requireNativeComponent} from 'react-native';

export default class ScrollBlockView extends PureComponent {
  static propTypes = {
    ...View.propTypes,
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
