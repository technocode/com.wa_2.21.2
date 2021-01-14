package com.whatsapp;

import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass03S;
import X.AnonymousClass0HN;
import X.AnonymousClass0L6;
import X.AnonymousClass0LC;
import X.AnonymousClass0TX;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C02770Dj;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.directmigration.RequestPermissionFromSisterAppActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RequestPermissionActivity extends AnonymousClass2C0 {
    public static final Map A07;
    public boolean A00;
    public boolean A01;
    public final AnonymousClass0LC A02 = AnonymousClass0LC.A00();
    public final AnonymousClass0HN A03 = AnonymousClass0HN.A00();
    public final AnonymousClass03S A04 = AnonymousClass03S.A00();
    public final AnonymousClass00D A05 = AnonymousClass00D.A00();
    public final AnonymousClass0L6 A06 = AnonymousClass0L6.A00();

    static {
        HashMap hashMap = new HashMap(4);
        int[] iArr = new int[6];
        iArr[0] = R.string.permission_storage_cam_on_camera_access_request;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_cam_on_camera_access_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_cam_on_camera_access;
        }
        iArr[1] = i2;
        iArr[2] = R.string.permission_storage_need_write_access_on_camera_access_request;
        int i3 = R.string.permission_storage_need_write_access_on_camera_access_v30;
        if (i < 30) {
            i3 = R.string.permission_storage_need_write_access_on_camera_access;
        }
        iArr[3] = i3;
        iArr[4] = R.string.permission_cam_access_request;
        iArr[5] = R.string.permission_cam_access;
        hashMap.put(30, iArr);
        int[] iArr2 = new int[6];
        iArr2[0] = R.string.permission_storage_cam_on_attaching_photo_request;
        int i4 = R.string.permission_storage_cam_on_attaching_photo_v30;
        if (i < 30) {
            i4 = R.string.permission_storage_cam_on_attaching_photo;
        }
        iArr2[1] = i4;
        iArr2[2] = R.string.permission_storage_need_write_access_on_attaching_photo_request;
        int i5 = R.string.permission_storage_need_write_access_on_attaching_photo_v30;
        if (i < 30) {
            i5 = R.string.permission_storage_need_write_access_on_attaching_photo;
        }
        iArr2[3] = i5;
        iArr2[4] = R.string.permission_cam_access_on_attaching_photo_request;
        iArr2[5] = R.string.permission_cam_access_on_attaching_photo;
        hashMap.put(31, iArr2);
        int[] iArr3 = new int[6];
        iArr3[0] = R.string.permission_storage_cam_on_attaching_video_request;
        int i6 = R.string.permission_storage_cam_on_attaching_video_v30;
        if (i < 30) {
            i6 = R.string.permission_storage_cam_on_attaching_video;
        }
        iArr3[1] = i6;
        iArr3[2] = R.string.permission_storage_need_write_access_on_attaching_video_request;
        int i7 = R.string.permission_storage_need_write_access_on_attaching_video_v30;
        if (i < 30) {
            i7 = R.string.permission_storage_need_write_access_on_attaching_video;
        }
        iArr3[3] = i7;
        iArr3[4] = R.string.permission_cam_access_on_attaching_video_request;
        iArr3[5] = R.string.permission_cam_access_on_attaching_video;
        hashMap.put(32, iArr3);
        int[] iArr4 = new int[6];
        iArr4[0] = R.string.permission_storage_cam_on_post_status_request;
        int i8 = R.string.permission_storage_cam_on_post_status_v30;
        if (i < 30) {
            i8 = R.string.permission_storage_cam_on_post_status;
        }
        iArr4[1] = i8;
        iArr4[2] = R.string.permission_storage_need_write_access_on_post_status_request;
        int i9 = R.string.permission_storage_need_write_access_on_post_status_v30;
        if (i < 30) {
            i9 = R.string.permission_storage_need_write_access_on_post_status;
        }
        iArr4[3] = i9;
        iArr4[4] = R.string.permission_cam_on_post_status_request;
        iArr4[5] = R.string.permission_cam_on_post_status;
        hashMap.put(33, iArr4);
        A07 = Collections.unmodifiableMap(hashMap);
    }

    public static Intent A04(Context context, int i, int i2, boolean z) {
        return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_contacts_small).putExtra("permissions", new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}).putExtra("message_id", i).putExtra("perm_denial_message_id", i2).putExtra("force_ui", z);
    }

    public static Intent A05(Context context, int i, int i2, boolean z) {
        return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_storage).putExtra("permissions", new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).putExtra("message_id", i).putExtra("perm_denial_message_id", i2).putExtra("force_ui", z);
    }

    public static Intent A06(Context context, AnonymousClass03S r14, int i) {
        boolean z = !r14.A06();
        boolean z2 = false;
        if (r14.A02("android.permission.CAMERA") != 0) {
            z2 = true;
        }
        int[] iArr = (int[]) A07.get(Integer.valueOf(i));
        if (iArr == null) {
            AnonymousClass008.A0u("conversation/check/camera/storage/permissions/unexpected request code ", i);
            return null;
        } else if (z2) {
            if (z) {
                return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{R.drawable.permission_storage, R.drawable.permission_plus, R.drawable.permission_cam}).putExtra("permissions", new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).putExtra("message_id", iArr[0]).putExtra("perm_denial_message_id", iArr[1]);
            }
            return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_cam).putExtra("message_id", iArr[4]).putExtra("perm_denial_message_id", iArr[5]).putExtra("permissions", new String[]{"android.permission.CAMERA"});
        } else if (z) {
            return A05(context, iArr[2], iArr[3], false);
        } else {
            return null;
        }
    }

    public static void A07(Activity activity) {
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/phone_number activity is finishing: do nothing");
            return;
        }
        activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_call).putExtra("permissions", (String[]) ((AbstractCollection) AnonymousClass03S.A01()).toArray(new String[0])).putExtra("message_id", R.string.permission_read_phone_number_request).putExtra("perm_denial_message_id", R.string.permission_read_phone_number_permission_needed).putExtra("force_ui", true), 155);
    }

    public static void A08(Activity activity, int i, int i2) {
        A0A(activity, i, i2, false, 150);
    }

    public static void A09(Activity activity, int i, int i2) {
        A0B(activity, i, i2, false, 151);
    }

    public static void A0A(Activity activity, int i, int i2, boolean z, int i3) {
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/contacts passed activity is finishing: do nothing");
        } else {
            activity.startActivityForResult(A04(activity, i, i2, z), i3);
        }
    }

    public static void A0B(Activity activity, int i, int i2, boolean z, int i3) {
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/storage passed activity is finishing: do nothing");
        } else {
            activity.startActivityForResult(A05(activity, i, i2, z), i3);
        }
    }

    public static void A0C(Activity activity, AnonymousClass02M r14, AnonymousClass03S r15, boolean z) {
        boolean z2;
        boolean z3;
        if ((Build.VERSION.SDK_INT >= 23 || r15.A09()) && (Build.VERSION.SDK_INT < 23 || r15.A02("android.permission.RECORD_AUDIO") == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || ((Build.VERSION.SDK_INT >= 23 || r15.A07()) && (Build.VERSION.SDK_INT < 23 || r15.A02("android.permission.CAMERA") == 0))) {
            z3 = false;
        } else {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder("request/permission/checkCameraAndMicPermissionsForVoipCall needMicPerm = ");
        sb.append(z2);
        sb.append(", needCameraPerm = ");
        sb.append(z3);
        Log.i(sb.toString());
        if (Build.VERSION.SDK_INT >= 23) {
            if (z3 && z2) {
                activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{R.drawable.permission_mic, R.drawable.permission_plus, R.drawable.permission_cam}).putExtra("permissions", new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}).putExtra("message_id", R.string.permission_mic_and_cam_on_video_call_request).putExtra("perm_denial_message_id", R.string.permission_mic_and_cam_on_video_call).putExtra("force_ui", true), 152);
            } else if (z2) {
                activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_mic).putExtra("message_id", R.string.permission_mic_access_request).putExtra("perm_denial_message_id", R.string.permission_mic_access).putExtra("permissions", new String[]{"android.permission.RECORD_AUDIO"}).putExtra("force_ui", true), 152);
            } else if (z3) {
                activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_cam).putExtra("message_id", R.string.permission_cam_access_on_video_call_request).putExtra("perm_denial_message_id", R.string.permission_cam_access_on_video_call).putExtra("permissions", new String[]{"android.permission.CAMERA"}).putExtra("force_ui", true), 152);
            }
        } else if (z3) {
            if (z2) {
                r14.A04(R.string.can_not_start_video_call_without_mic_and_camera_permission, 1);
            } else {
                r14.A04(R.string.can_not_start_video_call_without_camera_permission, 1);
            }
        } else if (z2) {
            r14.A04(R.string.can_not_start_voip_call_without_record_permission, 1);
        }
    }

    public static void A0D(Activity activity, AnonymousClass03S r11) {
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/flash_call activity is finishing: do nothing");
        } else if (!r11.A05()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(AnonymousClass03S.A01());
            Intent intent = new Intent(activity, RequestPermissionActivity.class);
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add("android.permission.READ_CALL_LOG");
                arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                intent.putExtra("permissions", (String[]) arrayList.toArray(new String[0])).putExtra("message_id", R.string.permission_flash_call_read_call_log_telephone_request).putExtra("perm_denial_message_id", R.string.permission_flash_call_read_call_log_telephone_permission_needed);
            } else {
                arrayList.add("android.permission.CALL_PHONE");
                intent.putExtra("permissions", (String[]) arrayList.toArray(new String[0])).putExtra("message_id", R.string.permission_flash_call_telephone_request).putExtra("perm_denial_message_id", R.string.permission_flash_call_telephone_permission_needed);
            }
            intent.putExtra("title_id", R.string.permission_flash_call_permission_title).putExtra("force_ui", true);
            activity.startActivityForResult(intent, 700);
        }
    }

    public static void A0E(Activity activity, AnonymousClass03S r12, int i) {
        Intent putExtra;
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/sms passed activity is finishing: do nothing");
            return;
        }
        boolean z = false;
        if (r12.A02("android.permission.SEND_SMS") == 0) {
            z = true;
        }
        boolean z2 = !z;
        boolean z3 = !r12.A08();
        if (z2 && z3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.SEND_SMS");
            arrayList.addAll(AnonymousClass03S.A01());
            putExtra = new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{R.drawable.permission_sms, R.drawable.permission_plus, R.drawable.permission_call}).putExtra("permissions", (String[]) arrayList.toArray(new String[0])).putExtra("message_id", R.string.permission_send_sms_telephone_request).putExtra("perm_denial_message_id", R.string.permission_send_sms_telephone_permission_needed).putExtra("force_ui", false);
        } else if (z2) {
            putExtra = new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_sms).putExtra("permissions", new String[]{"android.permission.SEND_SMS"}).putExtra("message_id", R.string.permission_send_sms_request).putExtra("perm_denial_message_id", R.string.permission_send_sms_permission_needed).putExtra("force_ui", false);
        } else {
            putExtra = new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_call).putExtra("permissions", (String[]) ((AbstractCollection) AnonymousClass03S.A01()).toArray(new String[0])).putExtra("message_id", R.string.permission_telephone_request).putExtra("perm_denial_message_id", R.string.permission_telephone_permission_needed).putExtra("force_ui", false);
        }
        activity.startActivityForResult(putExtra, i);
    }

    public static void A0F(AnonymousClass037 r3, int i, int i2) {
        Context A002 = r3.A00();
        if (A002 == null) {
            Log.d("request/permission/activity/contacts passed activity is finishing: do nothing");
        } else {
            r3.A0M(A04(A002, i, i2, false), 150, null);
        }
    }

    public static void A0G(AnonymousClass00D r5, String[] strArr) {
        for (String str : strArr) {
            if (r5 != null) {
                StringBuilder sb = new StringBuilder("wa-shared-prefs/set-permission-requested ");
                sb.append(str);
                Log.d(sb.toString());
                r5.A00.edit().putBoolean(str, true).apply();
                if (C002001d.A3i(C02770Dj.A07, str)) {
                    AnonymousClass008.A0n(r5, "live_location_is_new_user", true);
                    AnonymousClass008.A0n(r5, "nearby_location_new_user", true);
                }
            } else {
                throw null;
            }
        }
    }

    public static boolean A0H(Activity activity, AnonymousClass03S r6) {
        if (!(!r6.A06())) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_read_on_viewing_media_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_read_on_viewing_media;
        }
        activity.startActivityForResult(A05(activity, R.string.permission_storage_need_read_on_viewing_media_request, i2, false), 34);
        return false;
    }

    public static boolean A0I(Activity activity, AnonymousClass03S r9) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        boolean z = !r9.A06();
        boolean z2 = !r9.A03();
        if (z) {
            if (z2) {
                Intent intent = new Intent(activity, RequestPermissionActivity.class);
                intent.putExtra("drawable_ids", new int[]{R.drawable.permission_storage, R.drawable.permission_plus, R.drawable.permission_contacts_small});
                intent.putExtra("permissions", new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"});
                intent.putExtra("message_id", R.string.permission_storage_contacts_on_start_request).putExtra("force_ui", true);
                activity.startActivityForResult(intent, 17);
            } else {
                int i = Build.VERSION.SDK_INT;
                int i2 = R.string.permission_storage_need_write_access_v30;
                if (i < 30) {
                    i2 = R.string.permission_storage_need_write_access;
                }
                A0B(activity, R.string.permission_storage_need_write_access_request, i2, true, 17);
            }
        } else if (!z2) {
            return true;
        } else {
            A0A(activity, R.string.permission_contacts_access_request, R.string.permission_contacts_needed, true, 17);
        }
        return false;
    }

    public static boolean A0J(Activity activity, AnonymousClass03S r6) {
        if (r6.A06()) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_cam_on_share_status_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_cam_on_share_status;
        }
        activity.startActivityForResult(A05(activity, R.string.permission_storage_cam_on_share_status_request, i2, false), 151);
        return false;
    }

    public static boolean A0K(Activity activity, AnonymousClass03S r2, int i) {
        Intent A062 = A06(activity, r2, i);
        if (A062 == null) {
            return true;
        }
        activity.startActivityForResult(A062, i);
        return false;
    }

    public static boolean A0L(Activity activity, AnonymousClass03S r4, int i, int i2, int i3) {
        if (r4.A04()) {
            return true;
        }
        activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_location).putExtra("permissions", C02770Dj.A07).putExtra("perm_denial_message_id", i2).putExtra("message_id", i), i3);
        return false;
    }

    public static boolean A0M(Activity activity, String[] strArr) {
        for (String str : strArr) {
            if (!AnonymousClass0TX.A0I(activity, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0N(Context context, AnonymousClass03S r5) {
        if (!(!r5.A06())) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_read_on_viewing_media_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_read_on_viewing_media;
        }
        context.startActivity(A05(context, R.string.permission_storage_need_read_on_viewing_media_request, i2, false));
        return false;
    }

    public static boolean A0O(AnonymousClass037 r6, AnonymousClass03S r7) {
        if (r7.A06()) {
            return true;
        }
        Context A002 = r6.A00();
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_cam_on_share_status_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_cam_on_share_status;
        }
        r6.A0M(A05(A002, R.string.permission_storage_cam_on_share_status_request, i2, false), 151, null);
        return false;
    }

    public static boolean A0P(AnonymousClass00D r7, String[] strArr) {
        for (String str : strArr) {
            boolean z = r7.A00.getBoolean(str, false);
            StringBuilder sb = new StringBuilder("wa-shared-prefs/is-permission-requested ");
            sb.append(str);
            sb.append(" - ");
            sb.append(z);
            Log.d(sb.toString());
            if (z) {
                return false;
            }
        }
        return true;
    }

    public final String A0Q(Bundle bundle, boolean z) {
        int i;
        int[] intArray;
        if (z) {
            i = bundle.getInt("perm_denial_message_id");
        } else {
            i = bundle.getInt("message_id");
        }
        if (i == 0) {
            return null;
        }
        if (z) {
            intArray = bundle.getIntArray("perm_denial_message_params_id");
        } else {
            intArray = bundle.getIntArray("message_params_id");
        }
        if (intArray == null) {
            return ((AnonymousClass2C0) this).A01.A06(i);
        }
        int length = intArray.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = ((AnonymousClass2C0) this).A01.A06(intArray[i2]);
        }
        return ((AnonymousClass2C0) this).A01.A0D(i, strArr);
    }

    public void A0R(int i) {
        if (!(this instanceof RequestPermissionRegistrationActivity)) {
            setResult(i);
            return;
        }
        RequestPermissionRegistrationActivity requestPermissionRegistrationActivity = (RequestPermissionRegistrationActivity) this;
        requestPermissionRegistrationActivity.setResult(i, requestPermissionRegistrationActivity.A00);
    }

    public void A0S(Bundle bundle, String str) {
        if (str != null) {
            View findViewById = findViewById(R.id.permission_message);
            if (findViewById != null) {
                ((TextView) findViewById).setText(str);
                return;
            }
            throw null;
        }
        StringBuilder A0S = AnonymousClass008.A0S("request/permission/activity/there is no message id for ");
        A0S.append(Arrays.toString(bundle.getStringArray("permissions")));
        Log.e(A0S.toString());
        finish();
    }

    public void A0T(String[] strArr) {
        this.A01 = true;
        A0G(this.A05, strArr);
        AnonymousClass0TX.A0H(this, strArr, 0);
        View findViewById = findViewById(R.id.permission_request_dialog);
        if (findViewById != null) {
            findViewById.setVisibility(8);
            return;
        }
        throw null;
    }

    public void A0U(String[] strArr, boolean z) {
        View findViewById = findViewById(R.id.submit);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            if (z) {
                textView.setText(((AnonymousClass2C0) this).A01.A06(R.string.permission_settings_open));
                textView.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 9));
                return;
            }
            textView.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, strArr, 0));
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        if (r7 != false) goto L_0x00c3;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 435
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC005602q, X.ActivityC004902h
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0) {
            A0R(-1);
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr[i2] == 0) {
                    AnonymousClass008.A0j(this.A05, strArr[i2]);
                    if ("android.permission.WRITE_CONTACTS".equals(strArr[i2])) {
                        this.A02.A01(getApplicationContext());
                        this.A03.A04();
                    }
                } else {
                    StringBuilder A0S = AnonymousClass008.A0S("request/permission/activity/");
                    A0S.append(strArr[i2]);
                    A0S.append(" denied");
                    Log.i(A0S.toString());
                    A0R(0);
                }
            }
            finish();
        }
    }

    @Override // X.ActivityC004902h
    public void onResume() {
        boolean z;
        super.onResume();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String[] stringArray = extras.getStringArray("permissions");
            if (stringArray != null) {
                if (!(this instanceof RequestPermissionFromSisterAppActivity)) {
                    int length = stringArray.length;
                    z = false;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = true;
                            break;
                        }
                        String str = stringArray[i];
                        if (this.A04.A02(str) != 0) {
                            break;
                        }
                        AnonymousClass008.A0j(this.A05, str);
                        i++;
                    }
                } else {
                    z = RequestPermissionFromSisterAppActivity.A00(this, stringArray);
                }
                if (!z) {
                    return;
                }
            }
            if (!this.A00) {
                Log.i("request/permission/activity/permissions has been granted while we were paused");
                A0R(-1);
                finish();
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("permissions_requested", this.A01);
    }
}
