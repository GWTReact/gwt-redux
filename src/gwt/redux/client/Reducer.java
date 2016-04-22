package gwt.redux.client;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface Reducer<S, A extends Action> {
     S reduce(S state, A action);
}
