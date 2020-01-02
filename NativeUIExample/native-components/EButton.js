import React, {PureComponent} from 'react';
import PropTypes from 'prop-types';
import {View, TouchableWithoutFeedback, requireNativeComponent} from 'react-native';

const NativeComponent = requireNativeComponent("EButton", EButton, {});

export class EButton extends PureComponent {
    static propTypes = {
        ...View.propTypes,
        ...TouchableWithoutFeedback.propTypes,
        text: PropTypes.string,
        textColor: PropTypes.string,
        backgroundColor: PropTypes.string,
        textSize: PropTypes.number
    };
    static defaultProps = {
        textSize: 15,
        textColor: 'black'
    };

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <TouchableWithoutFeedback {...this.props}>
                <NativeComponent 
                    style={this.props.style}
                    text={this.props.text}
                    textColor={this.props.textColor}
                    backgroundColor={this.props.backgroundColor}
                    textSize={this.props.textColor}
                />
            </TouchableWithoutFeedback>
        );
    }
}