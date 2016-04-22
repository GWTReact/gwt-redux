package gwt.redux.client.addons.react_redux;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ConnectToComponentFn {
    <COMP, COMP2> COMP2 toComponent(COMP component);
}
