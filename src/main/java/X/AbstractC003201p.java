package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.01p  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC003201p {
    public static int A00 = -100;
    public static final AnonymousClass03V A01 = new AnonymousClass03V(0);
    public static final Object A02 = new Object();

    public static void A00() {
        synchronized (A02) {
            Iterator it = A01.iterator();
            while (true) {
                C06070Rp r1 = (C06070Rp) it;
                if (r1.hasNext()) {
                    AbstractC003201p r12 = (AbstractC003201p) ((WeakReference) r1.next()).get();
                    if (r12 != null) {
                        ((AnonymousClass0MW) r12).A0W(true);
                    }
                }
            }
        }
    }

    public static void A01(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (A00 != i) {
            A00 = i;
            A00();
        }
    }

    public static void A02(AbstractC003201p r4) {
        synchronized (A02) {
            Iterator it = A01.iterator();
            while (true) {
                C06070Rp r1 = (C06070Rp) it;
                if (r1.hasNext()) {
                    AbstractC003201p r0 = (AbstractC003201p) ((WeakReference) r1.next()).get();
                    if (r0 == r4 || r0 == null) {
                        r1.remove();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r16).getDepth() > 1) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A03(android.view.View r13, java.lang.String r14, android.content.Context r15, android.util.AttributeSet r16) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC003201p.A03(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0162, code lost:
        if (r1 == false) goto L_0x0164;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC06110Rt A04(X.AbstractC06100Rs r12) {
        /*
        // Method dump skipped, instructions count: 528
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC003201p.A04(X.0Rs):X.0Rt");
    }

    public void A05() {
        AnonymousClass0MW r2 = (AnonymousClass0MW) this;
        LayoutInflater from = LayoutInflater.from(r2.A0j);
        if (from.getFactory() == null) {
            C002001d.A2i(from, r2);
        } else if (!(from.getFactory2() instanceof AnonymousClass0MW)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void A06() {
        boolean z;
        AnonymousClass0MW r3 = (AnonymousClass0MW) this;
        r3.A0N();
        AnonymousClass0S2 r2 = r3.A0B;
        if (r2 != null) {
            if (!(r2 instanceof AnonymousClass0TC)) {
                z = false;
            } else {
                AnonymousClass0TC r22 = (AnonymousClass0TC) r2;
                ViewGroup A9m = r22.A01.A9m();
                Runnable runnable = r22.A07;
                A9m.removeCallbacks(runnable);
                r22.A01.A9m().postOnAnimation(runnable);
                z = true;
            }
            if (z) {
                return;
            }
        }
        r3.A00 = (1 << 0) | r3.A00;
        if (!r3.A0Z) {
            r3.A08.getDecorView().postOnAnimation(r3.A0m);
            r3.A0Z = true;
        }
    }

    public void A07() {
        AnonymousClass0MW r3 = (AnonymousClass0MW) this;
        synchronized (A02) {
            A02(r3);
        }
        if (r3.A0Z) {
            r3.A08.getDecorView().removeCallbacks(r3.A0m);
        }
        r3.A0f = false;
        r3.A0a = true;
        AnonymousClass0S2 r2 = r3.A0B;
        if (r2 != null && (r2 instanceof AnonymousClass0TC)) {
            AnonymousClass0TC r22 = (AnonymousClass0TC) r2;
            r22.A01.A9m().removeCallbacks(r22.A07);
        }
        AbstractC06370Sz r0 = r3.A0F;
        if (r0 != null) {
            r0.A02();
        }
        AbstractC06370Sz r02 = r3.A0E;
        if (r02 != null) {
            r02.A02();
        }
    }

    public void A08() {
        AnonymousClass0MW r3 = (AnonymousClass0MW) this;
        r3.A0f = false;
        synchronized (A02) {
            A02(r3);
        }
        r3.A0N();
        AnonymousClass0S2 r0 = r3.A0B;
        if (r0 != null) {
            r0.A0E(false);
        }
        if (r3.A0l instanceof Dialog) {
            AbstractC06370Sz r02 = r3.A0F;
            if (r02 != null) {
                r02.A02();
            }
            AbstractC06370Sz r03 = r3.A0E;
            if (r03 != null) {
                r03.A02();
            }
        }
    }

    public void A09(int i) {
        AnonymousClass0MW r2 = (AnonymousClass0MW) this;
        r2.A0L();
        ViewGroup viewGroup = (ViewGroup) r2.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(r2.A0j).inflate(i, viewGroup);
        ((AnonymousClass0TK) r2.A0D).A00.onContentChanged();
    }

    public void A0A(Configuration configuration) {
        AnonymousClass0MW r4 = (AnonymousClass0MW) this;
        if (r4.A0Y && r4.A0g) {
            r4.A0N();
            AnonymousClass0S2 r2 = r4.A0B;
            if (r2 != null && (r2 instanceof AnonymousClass0TA)) {
                AnonymousClass0TA r22 = (AnonymousClass0TA) r2;
                r22.A0I(r22.A01.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        C06340Sv A012 = C06340Sv.A01();
        Context context = r4.A0j;
        synchronized (A012) {
            AnonymousClass0TZ r1 = A012.A00;
            synchronized (r1) {
                C015008i r0 = (C015008i) r1.A06.get(context);
                if (r0 != null) {
                    r0.A04();
                }
            }
        }
        r4.A0W(false);
    }

    public void A0B(Bundle bundle) {
        AnonymousClass0MW r4 = (AnonymousClass0MW) this;
        r4.A0R = true;
        r4.A0W(false);
        r4.A0M();
        Object obj = r4.A0l;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = C002001d.A1O(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AnonymousClass0S2 r2 = r4.A0B;
                if (r2 == null) {
                    r4.A0U = true;
                } else if (r2 instanceof AnonymousClass0TA) {
                    AnonymousClass0TA r22 = (AnonymousClass0TA) r2;
                    if (!r22.A0E) {
                        int i = 0;
                        if (1 != 0) {
                            i = 4;
                        }
                        r22.A0F(i, 4);
                    }
                }
            }
        }
        r4.A0T = true;
    }

    public void A0C(View view) {
        AnonymousClass0MW r2 = (AnonymousClass0MW) this;
        r2.A0L();
        ViewGroup viewGroup = (ViewGroup) r2.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        ((AnonymousClass0TK) r2.A0D).A00.onContentChanged();
    }

    public void A0D(View view, ViewGroup.LayoutParams layoutParams) {
        AnonymousClass0MW r2 = (AnonymousClass0MW) this;
        r2.A0L();
        ((ViewGroup) r2.A07.findViewById(16908290)).addView(view, layoutParams);
        ((AnonymousClass0TK) r2.A0D).A00.onContentChanged();
    }

    public void A0E(View view, ViewGroup.LayoutParams layoutParams) {
        AnonymousClass0MW r2 = (AnonymousClass0MW) this;
        r2.A0L();
        ViewGroup viewGroup = (ViewGroup) r2.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        ((AnonymousClass0TK) r2.A0D).A00.onContentChanged();
    }

    public void A0F(Toolbar toolbar) {
        CharSequence charSequence;
        AnonymousClass0MW r3 = (AnonymousClass0MW) this;
        Object obj = r3.A0l;
        boolean z = obj instanceof Activity;
        if (z) {
            r3.A0N();
            AnonymousClass0S2 r4 = r3.A0B;
            if (!(r4 instanceof AnonymousClass0TA)) {
                r3.A05 = null;
                if (r4 != null && (r4 instanceof AnonymousClass0TC)) {
                    AnonymousClass0TC r42 = (AnonymousClass0TC) r4;
                    r42.A01.A9m().removeCallbacks(r42.A07);
                }
                if (toolbar != null) {
                    if (z) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = r3.A0N;
                    }
                    AnonymousClass0TC r0 = new AnonymousClass0TC(toolbar, charSequence, r3.A0D);
                    r3.A0B = r0;
                    r3.A08.setCallback(r0.A00);
                } else {
                    r3.A0B = null;
                    r3.A08.setCallback(r3.A0D);
                }
                r3.A06();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public void A0G(CharSequence charSequence) {
        AnonymousClass0MW r2 = (AnonymousClass0MW) this;
        r2.A0N = charSequence;
        AnonymousClass0T4 r0 = r2.A0L;
        if (r0 != null) {
            r0.setWindowTitle(charSequence);
            return;
        }
        AnonymousClass0S2 r1 = r2.A0B;
        if (r1 == null) {
            TextView textView = r2.A0A;
            if (textView != null) {
                textView.setText(charSequence);
            }
        } else if (r1 instanceof AnonymousClass0TA) {
            ((AnonymousClass0TA) r1).A0B.setWindowTitle(charSequence);
        } else if (r1 instanceof AnonymousClass0TC) {
            ((AnonymousClass0TC) r1).A01.setWindowTitle(charSequence);
        }
    }

    public boolean A0H(int i) {
        AnonymousClass0MW r5 = (AnonymousClass0MW) this;
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = AnonymousClass0PW.A03;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (r5.A0h && i == 108) {
            return false;
        }
        if (r5.A0Y && i == 1) {
            r5.A0Y = false;
        } else if (i != 1) {
            if (i == 2) {
                r5.A0O();
                r5.A0W = true;
                return true;
            } else if (i == 5) {
                r5.A0O();
                r5.A0V = true;
                return true;
            } else if (i == 10) {
                r5.A0O();
                r5.A0e = true;
                return true;
            } else if (i == 108) {
                r5.A0O();
                r5.A0Y = true;
                return true;
            } else if (i != 109) {
                return r5.A08.requestFeature(i);
            } else {
                r5.A0O();
                r5.A0d = true;
                return true;
            }
        }
        r5.A0O();
        r5.A0h = true;
        return true;
    }
}
