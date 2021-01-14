package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0IS  reason: invalid class name */
public class AnonymousClass0IS {
    public final AnonymousClass01I A00;
    public final AnonymousClass03S A01;
    public final AnonymousClass00D A02;
    public final AnonymousClass01X A03;
    public final AnonymousClass022 A04;
    public final AnonymousClass00T A05;
    public final boolean A06 = true;

    public AnonymousClass0IS(AnonymousClass01I r2, AnonymousClass00T r3, AnonymousClass01X r4, AnonymousClass03S r5, AnonymousClass00D r6, AnonymousClass022 r7) {
        this.A00 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r7;
    }

    public static final byte A00(String str) {
        if (str.equals("vnd.android.cursor.item/name")) {
            return 0;
        }
        if (str.equals("vnd.android.cursor.item/phone_v2")) {
            return 1;
        }
        if (str.equals("vnd.android.cursor.item/vnd.com.whatsapp.profile")) {
            return 2;
        }
        if (str.equals("vnd.android.cursor.item/vnd.com.whatsapp.voip.call")) {
            return 3;
        }
        if (str.equals("vnd.android.cursor.item/vnd.com.whatsapp.video.call")) {
            return 4;
        }
        throw new IllegalStateException(AnonymousClass008.A0K("no code found for ", str));
    }

    public static final boolean A01(C007003k r1) {
        return r1 != null && r1.A08 != null && r1.A0X && !r1.A09() && !AnonymousClass1VY.A0T(r1.A09) && !(r1.A09 instanceof AnonymousClass2A1);
    }

    public static final boolean A02(ArrayList arrayList, ContentResolver contentResolver, String str) {
        boolean z;
        try {
            contentResolver.applyBatch("com.android.contacts", arrayList);
            z = true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidcontactssync/");
            sb.append(str);
            Log.e(sb.toString(), e);
            z = false;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
        arrayList.clear();
        return z;
    }

    public final Account A03(Context context) {
        Account account;
        AccountManager accountManager = AccountManager.get(context);
        Account[] accountsByType = accountManager.getAccountsByType("com.whatsapp");
        if (accountsByType.length == 0) {
            account = A04(context, accountManager);
            if (account == null) {
                return null;
            }
        } else {
            account = accountsByType[0];
            if (!TextUtils.equals(context.getString(R.string.app_name), account.name)) {
                accountManager.removeAccount(account, null, null);
                account = A04(context, accountManager);
                if (account == null) {
                    return null;
                }
            }
        }
        try {
            if (!ContentResolver.getSyncAutomatically(account, "com.android.contacts")) {
                ContentResolver.setSyncAutomatically(account, "com.android.contacts", true);
            }
            ContentResolver.addPeriodicSync(account, "com.android.contacts", new Bundle(), 3600);
            return account;
        } catch (NullPointerException e) {
            if (e.getMessage() != null && e.getMessage().startsWith("Attempt to invoke virtual method 'com.prism.gaia.server.content.e")) {
                return account;
            }
            throw e;
        }
    }

    public final Account A04(Context context, AccountManager accountManager) {
        AnonymousClass01I r0 = this.A00;
        r0.A04();
        if (r0.A03 == null) {
            Log.e("androidcontactssync/get-or-create-account null jid");
            return null;
        }
        Account account = new Account(context.getString(R.string.app_name), "com.whatsapp");
        if (accountManager.addAccountExplicitly(account, null, null)) {
            ContentResolver.setIsSyncable(account, "com.android.contacts", 1);
            return account;
        }
        Log.e("androidcontactssync/get-or-create-account failed to add account");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04f8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04f9, code lost:
        if (r7 != null) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04fe, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05ad, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05ae, code lost:
        if (r10 != null) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05b3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0a0a, code lost:
        if (r5.contains(java.lang.Byte.valueOf(A00("vnd.android.cursor.item/name"))) == false) goto L_0x0a0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0ee6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0ee7, code lost:
        if (r4 != null) goto L_0x0ee9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0eec, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0157, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0202, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0206, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0217, code lost:
        if (A02(r9, r8, "androidcontactssync/onVersionUpgrade/error") != false) goto L_0x0219;
     */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0585 A[Catch:{ all -> 0x05ad }, LOOP:8: B:200:0x0585->B:202:0x058b, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0b80  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0b95  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0bc1  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0e16  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0e65  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List A05(android.content.Context r37, java.util.Set r38, java.util.List r39) {
        /*
        // Method dump skipped, instructions count: 3835
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IS.A05(android.content.Context, java.util.Set, java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A06(android.content.Context r22, android.accounts.Account r23) {
        /*
        // Method dump skipped, instructions count: 354
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IS.A06(android.content.Context, android.accounts.Account):void");
    }

    public synchronized boolean A07(Context context) {
        if (!this.A01.A03()) {
            Log.w("androidcontactssync/clearsyncdata/permission_denied");
            return true;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", context.getString(R.string.app_name)).appendQueryParameter("account_type", "com.whatsapp").appendQueryParameter("caller_is_syncadapter", "true").build();
        Log.i("androidcontactssync/clearsyncdata/delete");
        try {
            contentResolver.delete(build, "account_name = ? AND account_type = ?", new String[]{context.getString(R.string.app_name), "com.whatsapp"});
            return true;
        } catch (SecurityException e) {
            if (e.getMessage() != null && e.getMessage().startsWith("User 0 tying to get authenticator types for ")) {
                return false;
            }
            throw e;
        }
    }
}
