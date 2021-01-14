package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.voipcalling.PermissionDialogFragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: X.02h  reason: invalid class name and case insensitive filesystem */
public class ActivityC004902h extends AnonymousClass02i implements AbstractC005602q, AbstractC005702r {
    public int A00;
    public C06540Tt A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06 = true;
    public final C06160Sa A07 = new C06160Sa(new AnonymousClass0SQ(this));
    public final C013807v A08 = new C013807v(this);

    public static void A01(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public static boolean A02(AnonymousClass0LW r4, EnumC014207z r5) {
        boolean z = false;
        for (AnonymousClass037 r2 : r4.A0Q.A04()) {
            if (r2 != null) {
                AnonymousClass0SQ r0 = r2.A0F;
                if (!(r0 == null || r0.A04 == null)) {
                    z |= A02(r2.A0C(), r5);
                }
                if (r2.A0K.A02.compareTo((Enum) EnumC014207z.STARTED) >= 0) {
                    r2.A0K.A05(r5);
                    z = true;
                }
            }
        }
        return z;
    }

    public final int A03(AnonymousClass037 r6) {
        C06540Tt r4 = this.A01;
        if (r4.A00() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (true) {
            int i = this.A00;
            if (r4.A01) {
                r4.A03();
            }
            if (AnonymousClass03W.A00(r4.A02, r4.A00, i) >= 0) {
                this.A00 = (i + 1) % 65534;
            } else {
                r4.A05(i, r6.A0S);
                this.A00 = (this.A00 + 1) % 65534;
                return i;
            }
        }
    }

    public AnonymousClass0LW A04() {
        return this.A07.A00.A03;
    }

    public void A05() {
        if (!(this instanceof ActivityC004802g)) {
            invalidateOptionsMenu();
        } else {
            ((ActivityC004802g) this).A0A().A06();
        }
    }

    public void A08(AnonymousClass037 r4, Intent intent, int i, Bundle bundle) {
        this.A05 = true;
        if (i == -1) {
            try {
                startActivityForResult(intent, -1, bundle);
            } finally {
                this.A05 = false;
            }
        } else {
            A01(i);
            startActivityForResult(intent, ((A03(r4) + 1) << 16) + (i & 65535), bundle);
            this.A05 = false;
        }
    }

    @Override // X.AbstractC005702r
    public final void AR1(int i) {
        if (!this.A03 && i != -1) {
            A01(i);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String obj = sb.toString();
        printWriter.print(obj);
        printWriter.print("mCreated=");
        printWriter.print(this.A02);
        printWriter.print(" mResumed=");
        printWriter.print(this.A04);
        printWriter.print(" mStopped=");
        printWriter.print(this.A06);
        if (getApplication() != null) {
            AbstractC15640oQ.A00(this).A03(obj, fileDescriptor, printWriter, strArr);
        }
        this.A07.A00.A03.A0k(str, fileDescriptor, printWriter, strArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr;
        Object obj;
        AnonymousClass0LW r6 = this.A07.A00.A03;
        r6.A0B();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            C06540Tt r5 = this.A01;
            String str = (String) r5.A02(i4, null);
            int A002 = AnonymousClass03W.A00(r5.A02, r5.A00, i4);
            if (A002 >= 0 && (objArr = r5.A03)[A002] != (obj = C06540Tt.A04)) {
                objArr[A002] = obj;
                r5.A01 = true;
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            AnonymousClass037 A022 = r6.A0Q.A02(str);
            if (A022 == null) {
                AnonymousClass008.A1B("Activity result no fragment exists for who: ", str, "FragmentActivity");
            } else {
                A022.A0g(i & 65535, i2, intent);
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass0LW r0 = this.A07.A00.A03;
        r0.A0B();
        r0.A0K(configuration);
    }

    @Override // X.AnonymousClass02i, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        int length;
        AnonymousClass0SQ r2 = this.A07.A00;
        AnonymousClass0LW r4 = r2.A03;
        r4.A0g(r2, r2, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (r2 instanceof AbstractC005302m) {
                r4.A0L(parcelable);
                if (bundle.containsKey("android:support:next_request_index")) {
                    this.A00 = bundle.getInt("android:support:next_request_index");
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (intArray == null || stringArray == null || (length = intArray.length) != stringArray.length) {
                        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                    } else {
                        this.A01 = new C06540Tt(length);
                        for (int i = 0; i < length; i++) {
                            this.A01.A05(intArray[i], stringArray[i]);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.A01 == null) {
            this.A01 = new C06540Tt(10);
            this.A00 = 0;
        }
        super.onCreate(bundle);
        this.A08.A04(AnonymousClass082.ON_CREATE);
        r4.A0L = false;
        r4.A0M = false;
        r4.A0I(1);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C06160Sa r0 = this.A07;
        return onCreatePanelMenu | r0.A00.A03.A0v(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.A07.A00.A03.A0O.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.A07.A00.A03.A0O.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.A00.A03.A08();
        this.A08.A04(AnonymousClass082.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A07.A00.A03.A09();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.A07.A00.A03.A0x(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.A07.A00.A03.A0w(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.A07.A00.A03.A0o(z);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A07.A00.A03.A0B();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.A07.A00.A03.A0M(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.A04 = false;
        this.A07.A00.A03.A0I(3);
        this.A08.A04(AnonymousClass082.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.A07.A00.A03.A0p(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.A08.A04(AnonymousClass082.ON_RESUME);
        AnonymousClass0LW r1 = this.A07.A00.A03;
        r1.A0L = false;
        r1.A0M = false;
        r1.A0I(4);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | this.A07.A00.A03.A0u(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // X.AbstractC005602q
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Object[] objArr;
        Object obj;
        AnonymousClass0LW r7 = this.A07.A00.A03;
        r7.A0B();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            C06540Tt r5 = this.A01;
            String str = (String) r5.A02(i3, null);
            int A002 = AnonymousClass03W.A00(r5.A02, r5.A00, i3);
            if (A002 >= 0 && (objArr = r5.A03)[A002] != (obj = C06540Tt.A04)) {
                objArr[A002] = obj;
                r5.A01 = true;
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            AnonymousClass037 A022 = r7.A0Q.A02(str);
            if (A022 == null) {
                AnonymousClass008.A1B("Activity result no fragment exists for who: ", str, "FragmentActivity");
                return;
            }
            int i4 = i & 65535;
            if (A022 instanceof PermissionDialogFragment) {
                PermissionDialogFragment permissionDialogFragment = (PermissionDialogFragment) A022;
                boolean z = false;
                if (i4 != 100) {
                    AnonymousClass00E.A08(false, "Unknown request code");
                    return;
                }
                StringBuilder A0S = AnonymousClass008.A0S("PermissionDialogFragment/onRequestPermissionsResult permissions: ");
                A0S.append(Arrays.toString(strArr));
                A0S.append(", grantResults: ");
                A0S.append(Arrays.toString(iArr));
                com.whatsapp.util.Log.i(A0S.toString());
                int length = iArr.length;
                boolean z2 = false;
                if (length > 0) {
                    z2 = true;
                }
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (iArr[i5] != 0) {
                            break;
                        }
                        i5++;
                    } else {
                        z = z2;
                        break;
                    }
                }
                AbstractC07220Wk r1 = permissionDialogFragment.A04;
                if (r1 == null) {
                    return;
                }
                if (z) {
                    r1.AIS(permissionDialogFragment.A00, strArr);
                } else {
                    r1.AIR(permissionDialogFragment.A00);
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.A04 = true;
        AnonymousClass0LW r0 = this.A07.A00.A03;
        r0.A0B();
        r0.A0q(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass02i, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (A02(A04(), EnumC014207z.CREATED));
        this.A08.A04(AnonymousClass082.ON_STOP);
        Parcelable A042 = this.A07.A00.A03.A04();
        if (A042 != null) {
            bundle.putParcelable("android:support:fragments", A042);
        }
        if (this.A01.A00() > 0) {
            bundle.putInt("android:support:next_request_index", this.A00);
            C06540Tt r4 = this.A01;
            int[] iArr = new int[r4.A00()];
            String[] strArr = new String[r4.A00()];
            for (int i = 0; i < r4.A00(); i++) {
                if (r4.A01) {
                    r4.A03();
                }
                iArr[i] = r4.A02[i];
                if (r4.A01) {
                    r4.A03();
                }
                strArr[i] = r4.A03[i];
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.A06 = false;
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass0LW r1 = this.A07.A00.A03;
            r1.A0L = false;
            r1.A0M = false;
            r1.A0I(2);
        }
        AnonymousClass0LW r2 = this.A07.A00.A03;
        r2.A0B();
        r2.A0q(true);
        this.A08.A04(AnonymousClass082.ON_START);
        r2.A0L = false;
        r2.A0M = false;
        r2.A0I(3);
    }

    public void onStateNotSaved() {
        this.A07.A00.A03.A0B();
    }

    public void onStop() {
        super.onStop();
        this.A06 = true;
        do {
        } while (A02(A04(), EnumC014207z.CREATED));
        AnonymousClass0LW r1 = this.A07.A00.A03;
        r1.A0M = true;
        r1.A0I(2);
        this.A08.A04(AnonymousClass082.ON_STOP);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.A05 && i != -1) {
            A01(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.A05 && i != -1) {
            A01(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            A01(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            A01(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
