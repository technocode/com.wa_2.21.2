package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0uF  reason: invalid class name and case insensitive filesystem */
public enum EnumC18990uF {
    CLASS,
    clip,
    clip_path,
    clipPathUnits,
    clip_rule,
    color,
    cx,
    cy,
    direction,
    dx,
    dy,
    fx,
    fy,
    d,
    display,
    fill,
    fill_rule,
    fill_opacity,
    font,
    font_family,
    font_size,
    font_weight,
    font_style,
    gradientTransform,
    gradientUnits,
    height,
    href,
    image_rendering,
    marker,
    marker_start,
    marker_mid,
    marker_end,
    markerHeight,
    markerUnits,
    markerWidth,
    mask,
    maskContentUnits,
    maskUnits,
    media,
    offset,
    opacity,
    orient,
    overflow,
    pathLength,
    patternContentUnits,
    patternTransform,
    patternUnits,
    points,
    preserveAspectRatio,
    r,
    refX,
    refY,
    requiredFeatures,
    requiredExtensions,
    requiredFormats,
    requiredFonts,
    rx,
    ry,
    solid_color,
    solid_opacity,
    spreadMethod,
    startOffset,
    stop_color,
    stop_opacity,
    stroke,
    stroke_dasharray,
    stroke_dashoffset,
    stroke_linecap,
    stroke_linejoin,
    stroke_miterlimit,
    stroke_opacity,
    stroke_width,
    style,
    systemLanguage,
    text_anchor,
    text_decoration,
    transform,
    type,
    vector_effect,
    version,
    viewBox,
    width,
    x,
    y,
    x1,
    y1,
    x2,
    y2,
    viewport_fill,
    viewport_fill_opacity,
    visibility,
    UNSUPPORTED;
    
    public static final Map A00 = new HashMap();

    /* access modifiers changed from: public */
    static {
        EnumC18990uF[] values = values();
        for (EnumC18990uF r4 : values) {
            if (r4 == CLASS) {
                A00.put("class", r4);
            } else if (r4 != UNSUPPORTED) {
                A00.put(r4.name().replace('_', '-'), r4);
            }
        }
    }

    public static EnumC18990uF A00(String str) {
        EnumC18990uF r0 = (EnumC18990uF) A00.get(str);
        if (r0 != null) {
            return r0;
        }
        return UNSUPPORTED;
    }
}
