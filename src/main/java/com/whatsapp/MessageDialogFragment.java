package com.whatsapp;

import X.AbstractActivityC29861aJ;
import X.AbstractC43781yw;
import X.AbstractView$OnClickListenerC32271ec;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1IQ;
import X.AnonymousClass1IR;
import X.AnonymousClass1IS;
import X.AnonymousClass1Ml;
import X.AnonymousClass1PY;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C02590Cr;
import X.C74463ay;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import com.whatsapp.payments.ui.PaymentDeleteAccountActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.ArrayList;

public class MessageDialogFragment extends WaDialogFragment {
    public DialogInterface.OnClickListener A00;
    public final C02590Cr A01 = C02590Cr.A00();

    public static DialogFragment A00(int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, Object... objArr) {
        MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
        Bundle bundle = new Bundle();
        if (objArr != null) {
            int length = objArr.length;
            ArrayList<String> arrayList = new ArrayList<>(length);
            ArrayList<Integer> arrayList2 = new ArrayList<>(length);
            for (Object obj : objArr) {
                if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte)) {
                    arrayList2.add(1);
                } else {
                    arrayList2.add(2);
                }
                arrayList.add(obj.toString());
            }
            bundle.putStringArrayList("params_values", arrayList);
            bundle.putIntegerArrayList("params_types", arrayList2);
        }
        bundle.putInt("title_id", i);
        bundle.putInt("message_id", i2);
        bundle.putInt("primary_action_text_id", i3);
        messageDialogFragment.A00 = onClickListener;
        messageDialogFragment.A0N(bundle);
        return messageDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        String A0D;
        AnonymousClass01X A002 = AnonymousClass01X.A00();
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            int i = bundle2.getInt("message_id");
            if (i == 0) {
                A0D = ((AnonymousClass037) this).A06.getString("message");
            } else {
                ArrayList<String> stringArrayList = ((AnonymousClass037) this).A06.getStringArrayList("params_values");
                if (stringArrayList == null) {
                    A0D = A002.A06(i);
                } else {
                    ArrayList<Integer> integerArrayList = ((AnonymousClass037) this).A06.getIntegerArrayList("params_types");
                    if (integerArrayList == null || integerArrayList.size() != stringArrayList.size()) {
                        throw new IllegalArgumentException();
                    }
                    Object[] objArr = new Object[stringArrayList.size()];
                    for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                        if (integerArrayList.get(i2).intValue() == 1) {
                            objArr[i2] = Long.valueOf(Long.parseLong(stringArrayList.get(i2)));
                        } else {
                            objArr[i2] = stringArrayList.get(i2);
                        }
                    }
                    A0D = A002.A0D(i, objArr);
                }
            }
            int i3 = ((AnonymousClass037) this).A06.getInt("title_id");
            int i4 = ((AnonymousClass037) this).A06.getInt("primary_action_text_id");
            ActivityC004902h A0A = A0A();
            if (A0A != null) {
                AnonymousClass0MB r3 = new AnonymousClass0MB(A0A);
                CharSequence A1H = C002001d.A1H(A0D, A00(), null, this.A01);
                AnonymousClass0MC r2 = r3.A01;
                r2.A0E = A1H;
                r2.A0J = true;
                if (i4 == 0 || this.A00 == null) {
                    r3.A07(A002.A06(R.string.ok), new AnonymousClass1IS(this));
                } else {
                    r3.A07(A002.A06(i4), new AnonymousClass1IQ(this));
                    r3.A05(A002.A06(R.string.cancel), new AnonymousClass1IR(this));
                }
                if (i3 != 0) {
                    r2.A0I = A002.A06(i3);
                } else {
                    r2.A0I = ((AnonymousClass037) this).A06.getString("title");
                }
                return r3.A00();
            }
            throw null;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        AnonymousClass037 r2 = this.A0D;
        if (r2 != null && (r2 instanceof AnonymousClass1Ml)) {
            AnonymousClass1Ml r22 = (AnonymousClass1Ml) r2;
            Integer valueOf = Integer.valueOf(((AnonymousClass037) this).A06.getInt("message_id"));
            if (valueOf == null) {
                throw null;
            } else if (r22.AL1(valueOf.intValue())) {
                return;
            }
        }
        ActivityC004902h A0A = A0A();
        if (A0A instanceof ActivityC004702f) {
            ActivityC004702f r23 = (ActivityC004702f) A0A;
            Bundle bundle = ((AnonymousClass037) this).A06;
            if (bundle != null) {
                int i = bundle.getInt("message_id");
                if (r23 instanceof VerifyTwoFactorAuth) {
                    VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) r23;
                    if (i == R.string.two_factor_auth_wrong_code_message) {
                        if (verifyTwoFactorAuth.A07.isEnabled()) {
                            InputMethodManager A0H = verifyTwoFactorAuth.A0M.A0H();
                            if (A0H != null) {
                                A0H.toggleSoftInput(1, 0);
                                return;
                            }
                            throw null;
                        }
                    } else if (i == R.string.register_stale || i == R.string.register_verify_again || i == R.string.two_factor_auth_too_many_tries) {
                        verifyTwoFactorAuth.A0V.A0B();
                        verifyTwoFactorAuth.startActivity(new Intent(verifyTwoFactorAuth, RegisterPhone.class));
                        verifyTwoFactorAuth.finish();
                    }
                } else if (r23 instanceof DevicePairQrScannerActivity) {
                    AbstractActivityC29861aJ r24 = (AbstractActivityC29861aJ) r23;
                    if (i == R.string.network_required_airplane_on || i == R.string.network_required || i == R.string.timeout_qr_code) {
                        r24.A0U();
                    }
                } else if (!(r23 instanceof AbstractView$OnClickListenerC32271ec)) {
                    if (r23 instanceof PaymentDeleteAccountActivity) {
                        r23.setResult(-1);
                        r23.finish();
                    } else if (r23 instanceof AnonymousClass1PY) {
                        AnonymousClass1PY r25 = (AnonymousClass1PY) r23;
                        if (!(r25 instanceof IndiaUpiResetPinActivity)) {
                            if (!(r25 instanceof IndiaUpiPaymentActivity)) {
                                if (r25 instanceof IndiaUpiDeviceBindActivity) {
                                    IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity = (IndiaUpiDeviceBindActivity) r25;
                                    if (i == R.string.payments_sms_permission_msg) {
                                        indiaUpiDeviceBindActivity.A0G = false;
                                        indiaUpiDeviceBindActivity.finish();
                                        return;
                                    }
                                    indiaUpiDeviceBindActivity.A0Z();
                                    indiaUpiDeviceBindActivity.finish();
                                } else if (r25 instanceof IndiaUpiBankPickerActivity) {
                                    IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) r25;
                                    ListView listView = indiaUpiBankPickerActivity.A01;
                                    if (listView != null) {
                                        listView.setEnabled(true);
                                    }
                                    if (i != R.string.payments_bank_accounts_not_found) {
                                        indiaUpiBankPickerActivity.A0Z();
                                        indiaUpiBankPickerActivity.finish();
                                    }
                                } else if (!(r25 instanceof IndiaUpiBankAccountPickerActivity)) {
                                    r25.A0Z();
                                    r25.finish();
                                } else {
                                    IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) r25;
                                    ListView listView2 = indiaUpiBankAccountPickerActivity.A01;
                                    if (listView2 != null) {
                                        listView2.setEnabled(true);
                                    }
                                    if (i == R.string.payments_add_bank_success) {
                                        if (indiaUpiBankAccountPickerActivity.A02 != null) {
                                            Intent intent = new Intent();
                                            intent.putExtra("extra_bank_account", indiaUpiBankAccountPickerActivity.A02);
                                            AbstractC43781yw r0 = indiaUpiBankAccountPickerActivity.A02.A06;
                                            if (r0 != null) {
                                                intent.putExtra("extra_is_pin_set", ((C74463ay) r0).A0G);
                                            }
                                            indiaUpiBankAccountPickerActivity.setResult(-1, intent);
                                        }
                                        indiaUpiBankAccountPickerActivity.A0Z();
                                        indiaUpiBankAccountPickerActivity.finish();
                                        return;
                                    }
                                    indiaUpiBankAccountPickerActivity.A0Z();
                                    indiaUpiBankAccountPickerActivity.finish();
                                }
                            } else if (i != R.string.payments_send_insufficient_funds && i != R.string.payments_amount_cannot_edit) {
                                r25.A0Z();
                                r25.finish();
                            }
                        } else if (i == R.string.payments_set_pin_success) {
                            r25.A0Z();
                            r25.setResult(-1);
                            r25.finish();
                        } else {
                            r25.A0Z();
                            r25.finish();
                        }
                    } else if (!(r23 instanceof BrazilMerchantDetailsListActivity)) {
                        if (r23 instanceof DeepLinkActivity) {
                            r23.finish();
                            r23.overridePendingTransition(0, 0);
                        } else if (r23 instanceof VoipActivityV2) {
                            ContactPickerFragment contactPickerFragment = ((VoipActivityV2) r23).A0n;
                            if (contactPickerFragment != null) {
                                contactPickerFragment.A11(i);
                            }
                        } else if (r23 instanceof ContactPicker) {
                            ContactPickerFragment contactPickerFragment2 = ((ContactPicker) r23).A02;
                            if (contactPickerFragment2 != null) {
                                contactPickerFragment2.A11(i);
                            }
                        } else if (!(r23 instanceof ViewSharedContactArrayActivity)) {
                            if (r23 instanceof HomeActivity) {
                                HomeActivity homeActivity = (HomeActivity) r23;
                                if (homeActivity.A0U(homeActivity.A0L.getCurrentItem()) != 100) {
                                    return;
                                }
                                if (i == R.string.permission_storage_need_access || i == R.string.record_need_sd_card_message || i == R.string.record_need_sd_card_message_shared_storage || i == R.string.error_no_disc_space || i == R.string.insufficient_storage_dialog_subtitle) {
                                    homeActivity.A0L.A0B(HomeActivity.A04(((AnonymousClass2C0) homeActivity).A01, 200), true);
                                }
                            }
                        } else if (i == R.string.error_parse_vcard) {
                            r23.finish();
                        }
                    } else if (i == R.string.seller_account_is_removed) {
                        r23.finish();
                    }
                } else if (i == R.string.payment_method_is_removed) {
                    r23.finish();
                }
            } else {
                throw null;
            }
        }
    }
}
