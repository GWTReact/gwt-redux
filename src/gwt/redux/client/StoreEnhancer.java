package gwt.redux.client;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface StoreEnhancer {
    StoreCreator enhance(StoreCreator next);
}
