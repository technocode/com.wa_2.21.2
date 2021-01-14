package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0uG  reason: invalid class name and case insensitive filesystem */
public enum EnumC19000uG {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;
    
    public static final Map A00 = new HashMap();

    /* access modifiers changed from: public */
    static {
        EnumC19000uG[] values = values();
        for (EnumC19000uG r3 : values) {
            if (r3 == SWITCH) {
                A00.put("switch", r3);
            } else if (r3 != UNSUPPORTED) {
                A00.put(r3.name(), r3);
            }
        }
    }
}
