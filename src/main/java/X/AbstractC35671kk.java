package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.1kk  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC35671kk extends C242619s {
    public boolean A00;

    public AbstractC35671kk(C242819u r1) {
        super(r1);
    }

    public final void A0B() {
        int i;
        int i2;
        String str;
        if (this instanceof AnonymousClass26X) {
            AnonymousClass26X r2 = (AnonymousClass26X) this;
            C242819u r5 = ((C242619s) r2).A00;
            Context context = r5.A00;
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null) {
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0) {
                        AnonymousClass26T r4 = new AnonymousClass26T(r5);
                        try {
                            XmlResourceParser xml = ((C242619s) r4).A00.A01.getResources().getXml(i);
                            try {
                                xml.next();
                                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                    if (xml.getEventType() == 2) {
                                        String lowerCase = xml.getName().toLowerCase(Locale.US);
                                        if (lowerCase.equals("screenname")) {
                                            String attributeValue = xml.getAttributeValue(null, "name");
                                            String trim = xml.nextText().trim();
                                            if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim) && ((C35721kp) r4).A00 == null) {
                                                throw null;
                                            }
                                        } else if (lowerCase.equals("string")) {
                                            String attributeValue2 = xml.getAttributeValue(null, "name");
                                            String trim2 = xml.nextText().trim();
                                            if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                                                AnonymousClass1A7 r1 = ((C35721kp) r4).A00;
                                                if ("ga_appName".equals(attributeValue2)) {
                                                    r1.A01.A02 = trim2;
                                                } else if ("ga_appVersion".equals(attributeValue2)) {
                                                    r1.A01.A03 = trim2;
                                                } else if ("ga_logLevel".equals(attributeValue2)) {
                                                    r1.A01.A04 = trim2;
                                                } else {
                                                    AnonymousClass26U r12 = r1.A00.A07;
                                                    C242819u.A01(r12);
                                                    r12.A08("String xml configuration name not recognized", attributeValue2);
                                                }
                                            }
                                        } else if (lowerCase.equals("bool")) {
                                            String attributeValue3 = xml.getAttributeValue(null, "name");
                                            String trim3 = xml.nextText().trim();
                                            if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                                                try {
                                                    boolean parseBoolean = Boolean.parseBoolean(trim3);
                                                    AnonymousClass1A7 r13 = ((C35721kp) r4).A00;
                                                    if ("ga_dryRun".equals(attributeValue3)) {
                                                        r13.A01.A01 = parseBoolean ? 1 : 0;
                                                    } else {
                                                        AnonymousClass26U r14 = r13.A00.A07;
                                                        C242819u.A01(r14);
                                                        r14.A08("Bool xml configuration name not recognized", attributeValue3);
                                                    }
                                                } catch (NumberFormatException e) {
                                                    r4.A0A("Error parsing bool configuration value", trim3, e);
                                                }
                                            }
                                        } else if (lowerCase.equals("integer")) {
                                            String attributeValue4 = xml.getAttributeValue(null, "name");
                                            String trim4 = xml.nextText().trim();
                                            if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                                                try {
                                                    int parseInt = Integer.parseInt(trim4);
                                                    AnonymousClass1A7 r15 = ((C35721kp) r4).A00;
                                                    if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                                        r15.A01.A00 = parseInt;
                                                    } else {
                                                        AnonymousClass26U r16 = r15.A00.A07;
                                                        C242819u.A01(r16);
                                                        r16.A08("Int xml configuration name not recognized", attributeValue4);
                                                    }
                                                } catch (NumberFormatException e2) {
                                                    r4.A0A("Error parsing int configuration value", trim4, e2);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (IOException | XmlPullParserException e3) {
                                r4.A09("Error parsing tracker configuration file", e3);
                            }
                            AnonymousClass1A8 r6 = ((C35721kp) r4).A00.A01;
                            if (r6 != null) {
                                r2.A03("Loading global XML config values");
                                String str2 = r6.A02;
                                boolean z = false;
                                if (str2 != null) {
                                    r2.A01 = str2;
                                    r2.A07("XML config - app name", str2);
                                }
                                String str3 = r6.A03;
                                if (str3 != null) {
                                    r2.A02 = str3;
                                    r2.A07("XML config - app version", str3);
                                }
                                String str4 = r6.A04;
                                boolean z2 = false;
                                if (str4 != null) {
                                    z2 = true;
                                }
                                if (z2) {
                                    String lowerCase2 = str4.toLowerCase(Locale.US);
                                    if ("verbose".equals(lowerCase2)) {
                                        i2 = 0;
                                    } else if ("info".equals(lowerCase2)) {
                                        i2 = 1;
                                    } else if ("warning".equals(lowerCase2)) {
                                        i2 = 2;
                                    } else if ("error".equals(lowerCase2)) {
                                        i2 = 3;
                                    }
                                    r2.A06("XML config - log level", Integer.valueOf(i2));
                                }
                                int i3 = r6.A00;
                                if (i3 >= 0) {
                                    r2.A00 = i3;
                                    r2.A03 = true;
                                    r2.A07("XML config - dispatch period (sec)", Integer.valueOf(i3));
                                }
                                int i4 = r6.A01;
                                if (i4 != -1) {
                                    if (i4 == 1) {
                                        z = true;
                                    }
                                    r2.A05 = z;
                                    r2.A04 = true;
                                    r2.A07("XML config - dry run", Boolean.valueOf(z));
                                }
                            }
                        } catch (Resources.NotFoundException e4) {
                            r4.A08("inflate() called with unknown resourceId", e4);
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e5) {
                r2.A08("PackageManager doesn't know about the app package", e5);
            }
            r2.A04("Couldn't get ApplicationInfo to load global config");
        } else if (this instanceof AnonymousClass26W) {
            AnonymousClass26W r22 = (AnonymousClass26W) this;
            r22.A02 = ((C242619s) r22).A00.A00.getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
        } else if (this instanceof AnonymousClass26V) {
            AnonymousClass26V r23 = (AnonymousClass26V) this;
            r23.A06("Network initialized. User agent", r23.A01);
        } else if (this instanceof AnonymousClass26U) {
            AnonymousClass26U r24 = (AnonymousClass26U) this;
            synchronized (AnonymousClass26U.class) {
                AnonymousClass26U.A00 = r24;
            }
        } else if (this instanceof AnonymousClass26S) {
            AnonymousClass26S r25 = (AnonymousClass26S) this;
            try {
                r25.A0E();
                if (((Number) AnonymousClass1A5.A0F.A00).longValue() > 0) {
                    Context context2 = ((C242619s) r25).A00.A00;
                    ActivityInfo receiverInfo = context2.getPackageManager().getReceiverInfo(new ComponentName(context2, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                    if (receiverInfo != null && receiverInfo.enabled) {
                        r25.A03("Receiver registered for local dispatch.");
                        r25.A01 = true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } else if (!(this instanceof AnonymousClass26R) && !(this instanceof AnonymousClass26Q)) {
            if (this instanceof AnonymousClass26P) {
                AnonymousClass26P r26 = (AnonymousClass26P) this;
                r26.A05.A0B();
                r26.A09.A0B();
                r26.A04.A0B();
            } else if (this instanceof AnonymousClass26O) {
                AnonymousClass26O r27 = (AnonymousClass26O) this;
                C242819u r17 = ((C242619s) r27).A00;
                AnonymousClass16M r8 = r17.A02;
                C001801b.A1Q(r8);
                if (r8.A03 == null) {
                    synchronized (r8) {
                        if (r8.A03 == null) {
                            C35761kt r9 = new C35761kt();
                            Context context3 = r8.A01;
                            PackageManager packageManager = context3.getPackageManager();
                            String packageName = context3.getPackageName();
                            r9.A02 = packageName;
                            r9.A03 = packageManager.getInstallerPackageName(packageName);
                            String str5 = null;
                            try {
                                PackageInfo packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                                if (packageInfo != null) {
                                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                    if (!TextUtils.isEmpty(applicationLabel)) {
                                        packageName = applicationLabel.toString();
                                    }
                                    str5 = packageInfo.versionName;
                                }
                            } catch (PackageManager.NameNotFoundException unused2) {
                                String valueOf = String.valueOf(packageName);
                                if (valueOf.length() != 0) {
                                    str = "Error retrieving package info: appName set to ".concat(valueOf);
                                } else {
                                    str = new String("Error retrieving package info: appName set to ");
                                }
                                Log.e("GAv4", str);
                            }
                            r9.A00 = packageName;
                            r9.A01 = str5;
                            r8.A03 = r9;
                        }
                    }
                }
                C35761kt r3 = r8.A03;
                C35761kt r28 = r27.A00;
                if (!TextUtils.isEmpty(r3.A00)) {
                    r28.A00 = r3.A00;
                }
                if (!TextUtils.isEmpty(r3.A01)) {
                    r28.A01 = r3.A01;
                }
                if (!TextUtils.isEmpty(r3.A02)) {
                    r28.A02 = r3.A02;
                }
                if (!TextUtils.isEmpty(r3.A03)) {
                    r28.A03 = r3.A03;
                }
                AnonymousClass26X r18 = r17.A09;
                C242819u.A01(r18);
                r18.A0C();
                String str6 = r18.A01;
                if (str6 != null) {
                    r28.A00 = str6;
                }
                r18.A0C();
                String str7 = r18.A02;
                if (str7 != null) {
                    r28.A01 = str7;
                }
            } else if (!(this instanceof AnonymousClass26N) && !(this instanceof AnonymousClass26M) && (this instanceof AnonymousClass26L)) {
                ((AnonymousClass26L) this).A00.A0B();
            }
        }
        this.A00 = true;
    }

    public final void A0C() {
        if (!this.A00) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
