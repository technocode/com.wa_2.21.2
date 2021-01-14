package X;

/* renamed from: X.0u1  reason: invalid class name and case insensitive filesystem */
public class C18850u1 {
    public AbstractC18840u0 A00;
    public C18890u5 A01;

    public String A00() {
        if (this instanceof AnonymousClass28X) {
            return "radialGradient";
        }
        if (this instanceof AnonymousClass28W) {
            return "linearGradient";
        }
        if (this instanceof C453924o) {
            return "stop";
        }
        if (this instanceof C453824n) {
            return "solidColor";
        }
        if (this instanceof AnonymousClass2BQ) {
            return "textPath";
        }
        if (this instanceof AnonymousClass2CM) {
            return "text";
        }
        if (this instanceof AnonymousClass2CL) {
            return "tspan";
        }
        if (this instanceof AnonymousClass2BP) {
            return "tref";
        }
        if (this instanceof AnonymousClass2AF) {
            return "mask";
        }
        if (this instanceof AnonymousClass2CN) {
            return "view";
        }
        if (this instanceof AnonymousClass2CK) {
            return "symbol";
        }
        if (this instanceof AnonymousClass2CJ) {
            return "svg";
        }
        if (this instanceof AnonymousClass2CH) {
            return "pattern";
        }
        if (this instanceof AnonymousClass2CG) {
            return "marker";
        }
        if (this instanceof AnonymousClass2BI) {
            return "image";
        }
        if (this instanceof AnonymousClass2AE) {
            AnonymousClass2AE r1 = (AnonymousClass2AE) this;
            if (r1 instanceof AnonymousClass2BS) {
                return "use";
            }
            if (r1 instanceof AnonymousClass2BO) {
                return "switch";
            }
            if (!(r1 instanceof AnonymousClass2BG)) {
                return !(r1 instanceof AnonymousClass2BF) ? "group" : "clipPath";
            }
            return "defs";
        } else if (this instanceof AnonymousClass2BM) {
            return "rect";
        } else {
            if (this instanceof AnonymousClass2BL) {
                return !(((AnonymousClass2BL) this) instanceof AnonymousClass2CI) ? "polyline" : "polygon";
            }
            if (this instanceof AnonymousClass2BK) {
                return "path";
            }
            if (this instanceof AnonymousClass2BJ) {
                return "line";
            }
            if (!(this instanceof AnonymousClass2BH)) {
                return !(this instanceof AnonymousClass2BE) ? "" : "circle";
            }
            return "ellipse";
        }
    }
}
