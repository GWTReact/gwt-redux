package gwt.redux.client;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface Dispatch {
    <A extends Action>  void forward(A theAction);
}
