package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0tU  reason: invalid class name and case insensitive filesystem */
public enum EnumC18520tU {
    target,
    root,
    nth_child,
    nth_last_child,
    nth_of_type,
    nth_last_of_type,
    first_child,
    last_child,
    first_of_type,
    last_of_type,
    only_child,
    only_of_type,
    empty,
    not,
    lang,
    link,
    visited,
    hover,
    active,
    focus,
    enabled,
    disabled,
    checked,
    indeterminate,
    UNSUPPORTED;
    
    public static final Map A00 = new HashMap();

    /* access modifiers changed from: public */
    static {
        EnumC18520tU[] values = values();
        for (EnumC18520tU r4 : values) {
            if (r4 != UNSUPPORTED) {
                A00.put(r4.name().replace('_', '-'), r4);
            }
        }
    }
}
