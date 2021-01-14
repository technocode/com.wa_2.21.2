package androidx.fragment.app;

import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass0HW;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass0Yb;
import X.AnonymousClass3UH;
import X.C09190cR;
import X.C446520y;
import X.C73173Vt;
import X.DialogInterface$OnCancelListenerC15360nx;
import X.DialogInterface$OnDismissListenerC15370ny;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.biometric.FingerprintDialogFragment;
import androidx.biometric.FingerprintHelperFragment;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.ConnectionProgressDialogFragment;
import com.whatsapp.ConnectionUnavailableDialogFragment;
import com.whatsapp.MessageDialogFragment;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.dialogs.RoomsNUXBottomSheetDialogFragment;
import com.whatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import com.whatsapp.wabloks.base.BkFragment;
import com.whatsapp.wabloks.ui.PrivacyNoticeFragment;

public class DialogFragment extends AnonymousClass037 implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public Dialog A03;
    public DialogInterface.OnCancelListener A04 = new DialogInterface$OnCancelListenerC15360nx(this);
    public DialogInterface.OnDismissListener A05 = new DialogInterface$OnDismissListenerC15370ny(this);
    public Handler A06;
    public Runnable A07 = new RunnableEBaseShape0S0100000_I0_0(this, 13);
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = true;
    public boolean A0C;

    @Override // X.AnonymousClass037
    public void A0X() {
        this.A0U = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            this.A0C = true;
            dialog.setOnDismissListener(null);
            this.A03.dismiss();
            if (!this.A09) {
                onDismiss(this.A03);
            }
            this.A03 = null;
        }
    }

    @Override // X.AnonymousClass037
    public void A0Y() {
        this.A0U = true;
        if (!this.A0A && !this.A09) {
            this.A09 = true;
        }
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        super.A0a(context);
        if (!this.A0A) {
            this.A09 = false;
        }
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        Bundle bundle2;
        this.A0U = true;
        if (this.A0B) {
            View view = super.A0A;
            if (view != null) {
                if (view.getParent() == null) {
                    this.A03.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            ActivityC004902h A0A2 = A0A();
            if (A0A2 != null) {
                this.A03.setOwnerActivity(A0A2);
            }
            this.A03.setCancelable(this.A08);
            this.A03.setOnCancelListener(this.A04);
            this.A03.setOnDismissListener(this.A05);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.A03.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // X.AnonymousClass037
    public void A0f() {
        this.A0U = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            this.A0C = false;
            dialog.show();
        }
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        this.A06 = new Handler();
        boolean z = false;
        if (super.A02 == 0) {
            z = true;
        }
        this.A0B = z;
        if (bundle != null) {
            this.A01 = bundle.getInt("android:style", 0);
            this.A02 = bundle.getInt("android:theme", 0);
            this.A08 = bundle.getBoolean("android:cancelable", true);
            this.A0B = bundle.getBoolean("android:showsDialog", this.A0B);
            this.A00 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // X.AnonymousClass037
    public void A0j(Bundle bundle) {
        Bundle onSaveInstanceState;
        Dialog dialog = this.A03;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.A01;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.A02;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.A08;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.A0B;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.A00;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public int A0n() {
        if (!(this instanceof RoundedBottomSheetDialogFragment)) {
            return this.A02;
        }
        if (!(((RoundedBottomSheetDialogFragment) this) instanceof CartFragment)) {
            return R.style.RoundedBottomSheetDialogTheme;
        }
        return R.style.CartFragmentTheme;
    }

    public final Dialog A0o() {
        Dialog dialog = this.A03;
        if (dialog != null) {
            return dialog;
        }
        StringBuilder sb = new StringBuilder("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    public Dialog A0p(Bundle bundle) {
        return new Dialog(A01(), A0n());
    }

    public void A0q() {
        if (!(this instanceof PrivacyNoticeFragment)) {
            A0w(false, false);
            return;
        }
        BkFragment bkFragment = (BkFragment) this;
        bkFragment.A03.A00(new C73173Vt(3));
        bkFragment.A0w(false, false);
    }

    public void A0r() {
        A0w(true, false);
    }

    public void A0s(int i, int i2) {
        this.A01 = i;
        if (i == 2 || i == 3) {
            this.A02 = 16973913;
        }
        if (i2 != 0) {
            this.A02 = i2;
        }
    }

    public void A0t(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void A0u(AnonymousClass0LW r6, String str) {
        if (this instanceof VoipCallControlBottomSheet) {
            VoipCallControlBottomSheet voipCallControlBottomSheet = (VoipCallControlBottomSheet) this;
            AnonymousClass3UH r0 = voipCallControlBottomSheet.A0D;
            if (r0 != null) {
                VoipActivityV2 voipActivityV2 = r0.A00;
                if (voipActivityV2.A1N || voipActivityV2.A0n != null) {
                    Log.i("VoipCallControlBottomSheet bottom sheet action is disabled");
                    return;
                }
            }
            if (voipCallControlBottomSheet.A0J) {
                Log.i("VoipCallControlBottomSheet show after attached");
                BottomSheetBehavior bottomSheetBehavior = voipCallControlBottomSheet.A09;
                if (bottomSheetBehavior != null && bottomSheetBehavior.A0B == 5) {
                    voipCallControlBottomSheet.A14();
                    voipCallControlBottomSheet.A09.A0D(4);
                    voipCallControlBottomSheet.A1F(true);
                    voipCallControlBottomSheet.A12();
                    voipCallControlBottomSheet.A13();
                    return;
                }
                return;
            }
            voipCallControlBottomSheet.A0J = true;
            Log.i("VoipCallControlBottomSheet attaching bottom sheet");
            if (r6 != null) {
                AnonymousClass0QB r02 = new AnonymousClass0QB(r6);
                r02.A0A(0, voipCallControlBottomSheet, str, 1);
                r02.A04();
                return;
            }
            throw null;
        } else if (this instanceof MaximizedParticipantVideoDialogFragment) {
            MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = (MaximizedParticipantVideoDialogFragment) this;
            if (maximizedParticipantVideoDialogFragment.A0A) {
                Log.w("MaximizedParticipantVideoDialogFragment already attached");
                return;
            }
            maximizedParticipantVideoDialogFragment.A0A = true;
            if (r6 != null) {
                AnonymousClass0QB r1 = new AnonymousClass0QB(r6);
                r1.A0A(0, maximizedParticipantVideoDialogFragment, str, 1);
                r1.A01();
                maximizedParticipantVideoDialogFragment.A0L.run();
                return;
            }
            throw null;
        } else if (!(this instanceof StorageUsageDeleteMessagesDialogFragment)) {
            if (!(this instanceof StorageUsageDeleteCompleteDialogFragment)) {
                if (this instanceof ProgressDialogFragment) {
                    AnonymousClass0QB r2 = new AnonymousClass0QB(r6);
                    r2.A0A(0, this, str, 1);
                    r2.A01();
                } else if (!(this instanceof MessageDialogFragment)) {
                    if (!(this instanceof ConnectionUnavailableDialogFragment)) {
                        if (!(this instanceof ConnectionProgressDialogFragment)) {
                            this.A09 = false;
                            this.A0A = true;
                            AnonymousClass0QB r12 = new AnonymousClass0QB(r6);
                            r12.A0A(0, this, str, 1);
                            r12.A00();
                        } else if (r6 != null) {
                            AnonymousClass0QB r22 = new AnonymousClass0QB(r6);
                            r22.A0A(0, this, str, 1);
                            r22.A01();
                        } else {
                            throw null;
                        }
                    } else if (r6 != null) {
                        AnonymousClass0QB r23 = new AnonymousClass0QB(r6);
                        r23.A0A(0, this, str, 1);
                        r23.A01();
                    } else {
                        throw null;
                    }
                } else if (r6 != null) {
                    AnonymousClass0QB r24 = new AnonymousClass0QB(r6);
                    r24.A0A(0, this, str, 1);
                    r24.A01();
                } else {
                    throw null;
                }
            } else if (r6 != null) {
                AnonymousClass0QB r25 = new AnonymousClass0QB(r6);
                r25.A0A(0, this, str, 1);
                r25.A01();
            } else {
                throw null;
            }
        } else if (r6 != null) {
            AnonymousClass0QB r26 = new AnonymousClass0QB(r6);
            r26.A0A(0, this, str, 1);
            r26.A01();
        } else {
            throw null;
        }
    }

    public void A0v(boolean z) {
        this.A08 = z;
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void A0w(boolean z, boolean z2) {
        if (!this.A09) {
            this.A09 = true;
            this.A0A = false;
            Dialog dialog = this.A03;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.A03.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.A06.getLooper()) {
                        onDismiss(this.A03);
                    } else {
                        this.A06.post(this.A07);
                    }
                }
            }
            this.A0C = true;
            if (this.A00 >= 0) {
                AnonymousClass0LW A0D = A0D();
                int i = this.A00;
                if (i >= 0) {
                    A0D.A0h(new AnonymousClass0Yb(A0D, null, i, 1), false);
                    this.A00 = -1;
                    return;
                }
                throw new IllegalArgumentException(AnonymousClass008.A0F("Bad id: ", i));
            }
            AnonymousClass0QB r0 = new AnonymousClass0QB(A0D());
            r0.A03(this);
            if (z) {
                r0.A01();
            } else {
                r0.A00();
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        int i;
        Bundle bundle;
        AnonymousClass02N A012;
        FingerprintHelperFragment fingerprintHelperFragment;
        if (this instanceof RoomsNUXBottomSheetDialogFragment) {
            RoomsNUXBottomSheetDialogFragment roomsNUXBottomSheetDialogFragment = (RoomsNUXBottomSheetDialogFragment) this;
            C09190cR r5 = roomsNUXBottomSheetDialogFragment.A01;
            int i2 = roomsNUXBottomSheetDialogFragment.A03().getInt("entry_point");
            if (r5 != null) {
                C446520y r2 = new C446520y();
                if (i2 == 0) {
                    i = 3;
                } else if (i2 == 1) {
                    i = 2;
                } else if (i2 != 2) {
                    i = null;
                } else {
                    i = 1;
                }
                r2.A02 = i;
                r2.A00 = 3;
                r5.A05.A0B(r2, null, false);
                return;
            }
            throw null;
        } else if (this instanceof SelectPhoneNumberDialog) {
            AnonymousClass0HW r0 = ((SelectPhoneNumberDialog) this).A00;
            if (r0 != null) {
                r0.ADq();
            }
        } else if (this instanceof MuteDialogFragment) {
            MuteDialogFragment muteDialogFragment = (MuteDialogFragment) this;
            Bundle bundle2 = ((AnonymousClass037) muteDialogFragment).A06;
            if (bundle2 == null) {
                throw null;
            } else if (bundle2.getString("jids") == null && (bundle = ((AnonymousClass037) muteDialogFragment).A06) != null && (A012 = AnonymousClass02N.A01(bundle.getString("jid"))) != null) {
                muteDialogFragment.A08.A05(A012);
            }
        } else if (this instanceof SupportErrorDialogFragment) {
            DialogInterface.OnCancelListener onCancelListener = ((SupportErrorDialogFragment) this).A01;
            if (onCancelListener != null) {
                onCancelListener.onCancel(dialogInterface);
            }
        } else if ((this instanceof FingerprintDialogFragment) && (fingerprintHelperFragment = (FingerprintHelperFragment) this.A0H.A0Q.A01("FingerprintHelperFragment")) != null) {
            fingerprintHelperFragment.A0o(1);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0C) {
            A0w(true, true);
        }
    }
}
