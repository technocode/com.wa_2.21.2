package androidx.appcompat.app;

import X.AnonymousClass05V;
import X.AnonymousClass0T3;
import X.C04850Mb;
import X.C05560Pe;
import X.C07530Ya;
import X.C07670Zb;
import X.C07880a2;
import X.C08490bD;
import X.C13150ji;
import X.C13190jm;
import X.C13280jw;
import X.C29581Zk;
import X.C29591Zm;
import X.View$OnClickListenerC12820j8;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import java.lang.reflect.Constructor;
import java.util.Map;

public class AppCompatViewInflater {
    public static final String LOG_TAG = "AppCompatViewInflater";
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final Map sConstructorMap = new AnonymousClass05V();
    public static final Class[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {16843375};
    public final Object[] mConstructorArgs = new Object[2];

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new View$OnClickListenerC12820j8(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C07530Ya createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C07530Ya(context, attributeSet);
    }

    public C29581Zk createButton(Context context, AttributeSet attributeSet) {
        return new C29581Zk(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public C13150ji createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C13150ji(context, attributeSet);
    }

    public C07670Zb createEditText(Context context, AttributeSet attributeSet) {
        return new C07670Zb(context, attributeSet);
    }

    public C07880a2 createImageButton(Context context, AttributeSet attributeSet) {
        return new C07880a2(context, attributeSet);
    }

    public C08490bD createImageView(Context context, AttributeSet attributeSet) {
        return new C08490bD(context, attributeSet);
    }

    public C29591Zm createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C29591Zm(context, attributeSet);
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public C13190jm createRatingBar(Context context, AttributeSet attributeSet) {
        return new C13190jm(context, attributeSet);
    }

    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public C05560Pe createTextView(Context context, AttributeSet attributeSet) {
        return new C05560Pe(context, attributeSet);
    }

    public C13280jw createToggleButton(Context context, AttributeSet attributeSet) {
        return new C13280jw(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r0 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r0 == null) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(android.view.View r3, java.lang.String r4, android.content.Context r5, android.util.AttributeSet r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 862
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatViewInflater.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = (Constructor) sConstructorMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            sConstructorMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i < strArr.length) {
                        View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                        if (createViewByPrefix != null) {
                            return createViewByPrefix;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.mConstructorArgs;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View createViewByPrefix2 = createViewByPrefix(context, str, null);
                Object[] objArr3 = this.mConstructorArgs;
                objArr3[0] = null;
                objArr3[1] = null;
                return createViewByPrefix2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.mConstructorArgs;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    public static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A0d, 0, 0);
        int i = 0;
        if (z) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (z2 && i == 0 && (i = obtainStyledAttributes.getResourceId(4, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return (i == 0 || ((context instanceof C04850Mb) && ((C04850Mb) context).A00 == i)) ? context : new C04850Mb(context, i);
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }
}
