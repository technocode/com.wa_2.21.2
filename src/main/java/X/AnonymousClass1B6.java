package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: X.1B6  reason: invalid class name */
public class AnonymousClass1B6 extends FrameLayout {
    public final C35931lJ A00;

    public AnonymousClass1B6(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.A00 = new C35931lJ(this, context, googleMapOptions);
        setClickable(true);
    }

    public final void A00() {
        C35931lJ r1 = this.A00;
        AbstractC241018y r0 = ((AbstractC240918x) r1).A01;
        if (r0 != null) {
            try {
                ((C35921lI) r0).A02.onDestroy();
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            r1.A00(1);
        }
    }

    public final void A01() {
        AbstractC241018y r0 = ((AbstractC240918x) this.A00).A01;
        if (r0 != null) {
            try {
                ((C35921lI) r0).A02.onLowMemory();
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        }
    }

    public final void A02() {
        C35931lJ r1 = this.A00;
        AbstractC241018y r0 = ((AbstractC240918x) r1).A01;
        if (r0 != null) {
            try {
                ((C35921lI) r0).A02.AIJ();
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            r1.A00(5);
        }
    }

    public final void A03(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            C35931lJ r1 = this.A00;
            r1.A01(bundle, new C35461kO(r1, bundle));
            if (((AbstractC240918x) r1).A01 == null) {
                AnonymousClass0LP r9 = AnonymousClass0LP.A00;
                Context context = getContext();
                int A002 = r9.A00(context, 12451000);
                String A02 = AnonymousClass0LS.A02(context, A002);
                String A01 = AnonymousClass0LS.A01(context, A002);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView.setText(A02);
                linearLayout.addView(textView);
                Intent A012 = r9.A01(context, A002, null);
                if (A012 != null) {
                    Button button = new Button(context);
                    button.setId(16908313);
                    button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button.setText(A01);
                    linearLayout.addView(button);
                    button.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(context, A012, 0));
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void A04(Bundle bundle) {
        C35931lJ r1 = this.A00;
        AbstractC241018y r0 = ((AbstractC240918x) r1).A01;
        if (r0 != null) {
            C35921lI r02 = (C35921lI) r0;
            try {
                Bundle bundle2 = new Bundle();
                AnonymousClass1BJ.A01(bundle, bundle2);
                r02.A02.AJl(bundle2);
                AnonymousClass1BJ.A01(bundle2, bundle);
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            Bundle bundle3 = ((AbstractC240918x) r1).A00;
            if (bundle3 != null) {
                bundle.putAll(bundle3);
            }
        }
    }

    public void A05(AnonymousClass1B8 r3) {
        C001801b.A1S("getMapAsync() must be called on the main thread");
        C35931lJ r1 = this.A00;
        AbstractC241018y r0 = ((AbstractC240918x) r1).A01;
        if (r0 != null) {
            try {
                ((C35921lI) r0).A02.A7D(new AnonymousClass26d(r3));
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            r1.A04.add(r3);
        }
    }
}
