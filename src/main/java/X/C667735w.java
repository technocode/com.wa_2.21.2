package X;

import android.util.Pair;
import java.util.Stack;

/* renamed from: X.35w  reason: invalid class name and case insensitive filesystem */
public class C667735w {
    public static final C667635v A00;
    public static final C667635v A01;
    public static final C667635v A02;

    static {
        C667635v r3 = new C667635v("({[", ")}]");
        A02 = r3;
        C667635v r2 = new C667635v("*~_", "*~_");
        A00 = r2;
        A01 = new C667635v(r3, r2);
    }

    public static Pair A00(CharSequence charSequence, Pair pair, C667635v r7) {
        int intValue = ((Number) pair.first).intValue();
        char c = 0;
        char c2 = 0;
        if (intValue != 0) {
            c2 = charSequence.charAt(intValue - 1);
        }
        if (((Number) pair.second).intValue() != charSequence.length()) {
            c = charSequence.charAt(((Number) pair.second).intValue());
        }
        char charAt = charSequence.charAt(((Number) pair.first).intValue());
        char charAt2 = charSequence.charAt(((Number) pair.second).intValue() - 1);
        if (r7.A00(c2, c)) {
            return pair;
        }
        if (r7.A00(c2, charAt2)) {
            return new Pair(pair.first, Integer.valueOf(((Number) pair.second).intValue() - 1));
        }
        if (r7.A00(charAt, c)) {
            return new Pair(Integer.valueOf(((Number) pair.first).intValue() + 1), pair.second);
        }
        return r7.A00(charAt, charAt2) ? new Pair(Integer.valueOf(((Number) pair.first).intValue() + 1), Integer.valueOf(((Number) pair.second).intValue() - 1)) : pair;
    }

    public static boolean A01(CharSequence charSequence, Pair pair) {
        C667635v r5 = A02;
        Stack stack = new Stack();
        for (int intValue = ((Number) pair.first).intValue(); intValue < ((Number) pair.second).intValue(); intValue++) {
            char charAt = charSequence.charAt(intValue);
            String valueOf = String.valueOf(charAt);
            if ("({[".contains(valueOf)) {
                stack.push(Character.valueOf(charAt));
            } else if (!")}]".contains(valueOf)) {
                continue;
            } else if (stack.empty() || !r5.A00(((Character) stack.peek()).charValue(), charAt)) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
