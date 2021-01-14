package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientUtil;
import com.whatsapp.TellAFriendReceiver;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0cC  reason: invalid class name and case insensitive filesystem */
public class C09040cC {
    public static volatile C09040cC A05;
    public final AnonymousClass02M A00;
    public final C000300f A01;
    public final AnonymousClass01X A02;
    public final AnonymousClass00Y A03;
    public final AnonymousClass325 A04;

    public C09040cC(AnonymousClass02M r1, AnonymousClass325 r2, AnonymousClass00Y r3, C000300f r4, AnonymousClass01X r5) {
        this.A00 = r1;
        this.A04 = r2;
        this.A03 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public static C09040cC A00() {
        if (A05 == null) {
            synchronized (C09040cC.class) {
                if (A05 == null) {
                    A05 = new C09040cC(AnonymousClass02M.A00(), AnonymousClass325.A00(), AnonymousClass00Y.A00(), C000300f.A00(), AnonymousClass01X.A00());
                }
            }
        }
        return A05;
    }

    public void A01(Activity activity, Uri uri, String str, Integer num) {
        String str2;
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(uri);
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        if (!queryIntentActivities.isEmpty()) {
            StringBuilder A0S = AnonymousClass008.A0S("app/sms ");
            A0S.append(queryIntentActivities.size());
            Log.i(A0S.toString());
            if (Build.VERSION.SDK_INT >= 19) {
                str2 = Telephony.Sms.getDefaultSmsPackage(activity);
                if (!TextUtils.isEmpty(str2)) {
                    intent.setPackage(str2);
                } else {
                    ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                    str2 = activityInfo.packageName;
                }
            } else {
                ActivityInfo activityInfo2 = queryIntentActivities.get(0).activityInfo;
                intent.setClassName(activityInfo2.packageName, activityInfo2.name);
                str2 = activityInfo2.packageName;
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("sms_body", str);
            }
            activity.startActivity(intent);
            if (num != null && this.A01.A0D(AbstractC000400g.A1G)) {
                C43941zF r2 = new C43941zF();
                r2.A00 = 3;
                r2.A01 = num;
                r2.A02 = str2;
                this.A03.A0B(r2, null, false);
                return;
            }
            return;
        }
        Log.e("app/sms/no activities");
    }

    public void A02(Activity activity, Integer num) {
        if (num != null) {
            AnonymousClass01X r0 = this.A02;
            String A06 = r0.A06(R.string.tell_a_friend_via);
            int i = 0;
            String A0D = r0.A0D(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/");
            StringBuilder sb = new StringBuilder();
            sb.append(r0.A0D(R.string.tell_a_friend_email_body, "https://www.whatsapp.com/download/"));
            sb.append("\n\n");
            String obj = sb.toString();
            String A062 = r0.A06(R.string.tell_a_friend_email_subject);
            PackageManager packageManager = activity.getPackageManager();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            Intent[] intentArr = {new Intent("android.intent.action.VIEW").setType("vnd.android-dir/mms-sms").putExtra("sms_body", A0D), new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.EMAIL", " ").putExtra("android.intent.extra.TEXT", obj).putExtra("android.intent.extra.SUBJECT", A062)};
            Intent intent = null;
            int i2 = 0;
            do {
                Intent intent2 = intentArr[i2];
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, i);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str = activityInfo.name;
                        String str2 = activityInfo.applicationInfo.packageName;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("app/tell ");
                        sb2.append(i2);
                        sb2.append(" | ");
                        sb2.append(str2);
                        sb2.append(" | ");
                        sb2.append(str);
                        Log.i(sb2.toString());
                        if (!str2.contains("bluetooth") && !str2.equals("com.sec.android.app.FileTransferClient") && !str2.equals("com.sec.android.app.FileShareClient") && !str2.equals("com.sec.android.widgetapp.diotek.smemo") && !str2.equals("com.threebanana.notes") && !str2.equals("com.evernote") && !str2.equals("com.android.apps.tag") && !str2.equals("com.andrewshu.android.reddit") && !str2.equals("com.dataviz.stargate") && !str2.equals("com.dropbox.android") && !str2.equals("com.google.zxing.client.android") && !str2.equals("com.lg.valle.phone2chrome") && !str2.equals("com.motorola.blur.socialshare") && !str2.equals("com.whatsapp") && !str2.equals("com.whatsapp.w4b") && !str2.equals("la.droid.qr") && !str2.equals("com.google.android.apps.translate") && !str2.equals("com.google.android.apps.docs") && !str2.equals(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE) && !str2.equals("com.world.newspapers") && !str2.equals("lysesoft.andftp") && !str2.equals("com.klye.ime.latin") && !str2.equals("com.ideashower.readitlater.pro") && !str2.equals("com.springpad") && !str2.equals("ch.teamtasks.tasks.paid") && !str2.equals("flipboard.app") && !str2.equals("jp.naver.cafe") && !str2.equals("org.mozilla.firefox") && !str2.equals("com.linkedin.android") && !str2.equals("com.tenthbit.juliet") && !str2.equals("com.bumptech.bumpga")) {
                            intent = (Intent) intent2.clone();
                            intent.setClassName(str2, str);
                            intent.setPackage(str2);
                            if (str2.equals("mobi.qiss.plurq") || str2.equals("com.htc.socialnetwork.plurk") || str2.equals("com.facebook.orca") || str2.equals("com.google.android.apps.plus") || str2.equals("com.google.android.apps.googlevoice") || str2.equals("com.google.android.apps.messaging") || str2.equals("com.thedeck.android.app") || str2.equals("com.twitter.android") || str2.equals("tw.anddev.aplurk")) {
                                intent.removeExtra("android.intent.extra.EMAIL");
                                intent.putExtra("android.intent.extra.TEXT", A0D);
                            } else if (str2.equals("com.facebook.katana")) {
                                intent.putExtra("android.intent.extra.TEXT", "https://www.whatsapp.com/download/");
                            }
                            if (!hashSet.contains(str2)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("app/tell/add ");
                                sb3.append(intent);
                                Log.d(sb3.toString());
                                arrayList.add(intent);
                                hashSet.add(str2);
                                if (str.equals("com.lge.message.activity.compose.ComposeMessageActivity")) {
                                }
                            }
                        }
                        intent = intent;
                    }
                }
                i2++;
                i = 0;
            } while (i2 < 2);
            int size = arrayList.size();
            if (size == 0) {
                Log.w("app/tell/none");
                this.A00.A0G(r0.A06(R.string.error_no_email_client), 0);
            } else {
                String A0L = AnonymousClass008.A0L(Build.MANUFACTURER.replace(' ', '_'), "-", Build.MODEL.replace(' ', '_'));
                StringBuilder sb4 = new StringBuilder("app/packagedintents/device ");
                sb4.append(A0L);
                Log.i(sb4.toString());
                if (!A0L.equals("LGE-LU2300")) {
                    if (size > 1) {
                        int i3 = size - 1;
                        Object obj2 = arrayList.get(i3);
                        arrayList.remove(i3);
                        arrayList.add(0, obj2);
                    }
                    activity.startActivity(C002001d.A0S(arrayList, A06, PendingIntent.getBroadcast(activity, 0, new Intent(activity, TellAFriendReceiver.class).putExtra("extra_invite_source", num), 134217728).getIntentSender()));
                } else if (intent == null) {
                    Log.w("app/tell/none");
                    this.A00.A0G(r0.A06(R.string.error_no_email_client), 0);
                } else {
                    Log.i("app/tell/override");
                    activity.startActivity(intent);
                }
            }
            if (this.A01.A0D(AbstractC000400g.A1G)) {
                C43941zF r4 = new C43941zF();
                r4.A00 = 1;
                r4.A01 = num;
                this.A03.A0B(r4, null, false);
            }
        }
    }
}
