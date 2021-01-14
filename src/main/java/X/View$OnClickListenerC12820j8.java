package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0j8  reason: invalid class name and case insensitive filesystem */
public class View$OnClickListenerC12820j8 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Context A00;
    public Method A01;
    public final View A02;
    public final String A03;

    public View$OnClickListenerC12820j8(View view, String str) {
        this.A02 = view;
        this.A03 = str;
    }

    public void onClick(View view) {
        String obj;
        Method method = this.A01;
        if (method == null) {
            View view2 = this.A02;
            for (Context context = view2.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.A03, View.class)) != null) {
                        this.A01 = method;
                        this.A00 = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
            }
            int id = view2.getId();
            if (id == -1) {
                obj = "";
            } else {
                StringBuilder A0S = AnonymousClass008.A0S(" with id '");
                A0S.append(view2.getContext().getResources().getResourceEntryName(id));
                A0S.append("'");
                obj = A0S.toString();
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("Could not find method ");
            A0S2.append(this.A03);
            A0S2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            A0S2.append(view2.getClass());
            A0S2.append(obj);
            throw new IllegalStateException(A0S2.toString());
        }
        try {
            method.invoke(this.A00, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
