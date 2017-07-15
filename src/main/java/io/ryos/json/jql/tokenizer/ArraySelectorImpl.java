package io.ryos.json.jql.tokenizer;

import javax.json.JsonObject;

/**
 * Created by Void on 15.07.2017.
 */
public class ArraySelectorImpl<T extends JsonObject> implements Selector<T> {

    final String selection;

    public ArraySelectorImpl(String selection) {
        this.selection = selection;
    }

    @Override
    public T eval(T input) {
        return null;
    }

    public String getSelection() {
        return selection;
    }
}