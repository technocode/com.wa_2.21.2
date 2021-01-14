package X;

import com.whatsapp.util.Log;

/* renamed from: X.1qC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38631qC implements AnonymousClass0SG {
    public final /* synthetic */ ActivityC004702f A00;

    public /* synthetic */ C38631qC(ActivityC004702f r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        ActivityC004702f r2 = this.A00;
        int intValue = ((Number) obj).intValue();
        if (intValue == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(r2.getClass().getCanonicalName());
            sb.append(" ActivityLifecycleCallbacks: Recreating");
            Log.i(sb.toString());
            r2.recreate();
        } else if (intValue == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(r2.getClass().getCanonicalName());
            sb2.append(" ActivityLifecycleCallbacks: Re Launching");
            Log.i(sb2.toString());
            r2.finish();
            r2.startActivity(r2.getIntent());
        }
    }
}
