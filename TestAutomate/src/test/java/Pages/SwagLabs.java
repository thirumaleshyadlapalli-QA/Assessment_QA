package Pages;

import org.openqa.selenium.By;

public class SwagLabs {

    public static By userName = By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]");

    public static By passWord = By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]");

    public static By loginButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]");
    public static By homeScreen = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView");

    public static By menuButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView");
    public static By logOutButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]");


    public static By loginErrorMessage = By.xpath("//android.widget.TextView[@text=\"Username and password do not match any user in this service.\"]");

    public static By cartIcon =
            By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']");

    public static By cartBadge =
            By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']//android.widget.TextView");



//    =====================================

    public static By verifyAboutPhone = By.xpath("//android.widget.FrameLayout[@content-desc=\"About phone\"]");
    public static By verifyBasicInfo = By.xpath("//android.widget.TextView[@text='Basic info']");

    public static By verifyPhoneNumberSIMSlot1 = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Phone number (sim slot 1)\"]");

    public static By verifyPhoneNumberSIMSlot1Details = By.xpath("//android.widget.TextView[@text='Phone number (sim slot 1)']/following-sibling::android.widget.TextView[1]");
    public static By verifyPhoneNumberSIMSlot2 = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Phone number (sim slot 2)\"]");

    public static By verifyPhoneNumberSIMSlot2Details = By.xpath("//android.widget.TextView[@text='Phone number (sim slot 2)']/following-sibling::android.widget.TextView[1]");

    public static By verifyOwner = By.xpath("//android.widget.TextView[@text='Owner']");
    public static By verifyLegalAndRegulatory = By.xpath("//android.widget.TextView[@text='Legal & regulatory'] | //android.widget.TextView[@text='Legal and regulatory']");

    public static By verifyLegalInformation = By.xpath("//android.widget.TextView[@text='Legal information']");
    public static By verifyDeviceDetails = By.xpath("//android.widget.TextView[@text='Device details']");
    public static By verifyThirdPartyLicences = By.xpath("//android.widget.TextView[@text='Third-party licences'] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Third-party licenses\"]");
    public static By verifySystemWebViewLicences = By.xpath("//android.widget.TextView[@text='System WebView licences'] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"System WebView licenses\"]");

    public static By verifySIMStatusSIMSlot1 = By.xpath("//android.widget.TextView[@text='SIM status (SIM slot 1)'] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"SIM status (sim slot 1)\"]");

    public static By verifySIMStatusSIMSlot1Details = By.xpath("//android.widget.TextView[@text='SIM status (SIM slot 1)']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"SIM status (sim slot 1)\"]/following-sibling::android.widget.TextView[1]");
    public static By verifySIMStatusSIMSlot2 = By.xpath("//android.widget.TextView[@text='SIM status (SIM slot 2)'] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"SIM status (sim slot 2)\"]");

    public static By verifySIMStatusSIMSlot2Details = By.xpath("//android.widget.TextView[@text='SIM status (SIM slot 2)']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"SIM status (sim slot 2)\"]/following-sibling::android.widget.TextView[1]");

    public static By verifyModelSerialNumber = By.xpath("//android.widget.TextView[@text='Serial number']");
    public static By verifyModelSerialNumberDetails = By.xpath("//android.widget.TextView[@text='Serial number']/following-sibling::android.widget.TextView[1]");


    public static By verifyModel = By.xpath("//android.widget.TextView[@text='Model']");
    public static By verifyModelDetails = By.xpath("//android.widget.TextView[@text='Model']/following-sibling::android.widget.TextView[1]");
    public static By verifyIMEISIMSlot1 = By.xpath("//android.widget.TextView[@text='IMEI (SIM slot 1) (primary)'] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"IMEI (sim slot 1)\"]");

    public static By verifyIMEISIMSlot1Details = By.xpath("//android.widget.TextView[@text='IMEI (SIM slot 1) (primary)']/following-sibling::android.widget.TextView[1]");
    public static By verifyIMEISIMSlot2 = By.xpath("//android.widget.TextView[@text='IMEI (SIM slot 2)'] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"IMEI (sim slot 2)\"]");

    public static By verifyIMEISIMSlot2Details = By.xpath("//android.widget.TextView[@text='IMEI (SIM slot 2)']/following-sibling::android.widget.TextView[1]");
    public static By verifyAndroidVersion = By.xpath("//android.widget.TextView[@text='Android version']");
    public static By verifyAndroidVersionDetails = By.xpath("//android.widget.TextView[@text='Android version']/following-sibling::android.widget.TextView[1]");

    public static By verifyAndroidSecurityUpdate = By.xpath("//android.widget.TextView[@text='Android security update']");

    public static By verifyAndroidSecurityUpdateDetails = By.xpath("//android.widget.TextView[@text='Android security update']/following-sibling::android.widget.TextView[1]");

    public static By verifyAndroidBaseBandVersion = By.xpath("//android.widget.TextView[@text='Baseband version']");

    public static By verifyAndroidBaseBandVersionDetails = By.xpath("//android.widget.TextView[@text='Baseband version']/following-sibling::android.widget.TextView[1]");
    public static By verifyAndroidBootLoaderVersion = By.xpath("//android.widget.TextView[@text='Bootloader version']");

    public static By verifyAndroidBootLoaderVersionDetails = By.xpath("//android.widget.TextView[@text='Bootloader version']/following-sibling::android.widget.TextView[1]");
    public static By verifyAndroidKernelVersion = By.xpath("//android.widget.TextView[@text='Kernel version']");

    public static By verifyAndroidKernelVersionDetails = By.xpath("//android.widget.TextView[@text='Kernel version']/following-sibling::android.widget.TextView[1]");
    public static By verifyAndroidBuildNUmberVersion = By.xpath("//android.widget.TextView[@text='Build number']");

    public static By verifyAndroidBuildNUmberVersionDetails = By.xpath("//android.widget.TextView[@text='Build number']/following-sibling::android.widget.TextView[1]");


    public static By verifyDeviceIdentifiers = By.xpath("//android.widget.TextView[@text='Device identifiers']");

    public static By verifyIPAddressDetails = By.xpath("//android.widget.TextView[@text='IP address']/following-sibling::android.widget.TextView[1]");
    public static By verifyIPAddress = By.xpath("//android.widget.TextView[@text='IP address']");

    public static By verifyWIFIMACAddressDetails = By.xpath("//android.widget.TextView[@text='Wi‑Fi MAC address']/following-sibling::android.widget.TextView[1]");
    public static By verifyWIFIMACAddress = By.xpath("//android.widget.TextView[@text='Wi‑Fi MAC address']");

    public static By verifyDeviceWIFIMACAddressDetails = By.xpath("//android.widget.TextView[@text='Device Wi‑Fi MAC address']/following-sibling::android.widget.TextView[1]");
    public static By verifyDeviceWIFIMACAddress = By.xpath("//android.widget.TextView[@text='Device Wi‑Fi MAC address']");
    public static By verifyBluetoothDetails = By.xpath("//android.widget.TextView[@text='Bluetooth address']/following-sibling::android.widget.TextView[1]");
    public static By verifyBluetoothAddress = By.xpath("//android.widget.TextView[@text='Bluetooth address']");
    public static By verifyUptimeDetails = By.xpath("//android.widget.TextView[@text='Uptime']/following-sibling::android.widget.TextView[1]");
    public static By verifyUptime = By.xpath("//android.widget.TextView[@text='Uptime']");
    public static By verifyBuildNumberDetails = By.xpath("//android.widget.TextView[@text='Build number']/following-sibling::android.widget.TextView[1]");
    public static By verifyBuildNumber = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Build number\"]");


    //    =========================
    public static By verifyDeviceName = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Device name\"]");

    public static By verifyDeviceNameDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Device name\"]/following-sibling::android.widget.TextView[1]");

//******* Network and Internet*********

    public static By NetworkAndInternetSettings = By.xpath("//android.widget.TextView[@text='Network and Internet'] | //android.widget.TextView[@text='Network & internet']");

    public static By VerifyNetworkAndInternet = By.xpath("//android.widget.FrameLayout[@content-desc=\"Network and Internet\"] | //android.widget.FrameLayout[@content-desc=\"Network & internet\"]");

    public static By VerifyInternet = By.xpath("//android.widget.TextView[@text='Internet']");

    public static By VerifyInternetDetails = By.xpath("//android.widget.TextView[@text='Internet']/following-sibling::android.widget.TextView[1]");

    public static By VerifyCALANDSMS = By.xpath("//android.widget.TextView[@text='Calls and SMS']");

    public static By VerifyCALANDSMSDetails = By.xpath("//android.widget.TextView[@text='Calls and SMS']/following-sibling::android.widget.TextView[1]");

    public static By VerifyCALANDSMSScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Calls and SMS\"]");

    public static By VerifyCALANDSMSScreenWifiCalling = By.xpath("//android.widget.TextView[@text='Wi‑Fi calling']");
    public static By VerifySMS = By.xpath("//android.widget.TextView[@text='SMS']");

    public static By VerifySMSDetails = By.xpath("//android.widget.TextView[@text='SMS']/following-sibling::android.widget.TextView[1]");

    public static By VerifyCalls = By.xpath("//android.widget.TextView[@text='Calls']");

    public static By VerifyCallsDetails = By.xpath("//android.widget.TextView[@text='Calls']/following-sibling::android.widget.TextView[1]");

    public static By VerifySIMs = By.xpath("//android.widget.TextView[@text='SIMs']");

    public static By VerifySIMsDetails = By.xpath("//android.widget.TextView[@text='SIMs']/following-sibling::android.widget.TextView[1]");

    public static By VerifySIMsScreen = By.xpath("//android.widget.TextView[@text='Use this SIM']");

    public static By VerifySIMsScreenMobileData = By.xpath("//android.widget.TextView[@text='Mobile data']");
    public static By VerifySIMsScreenMobileDataChecked = By.xpath("//android.widget.TextView[@text='Mobile data']");

    public static By Verify4GCalling = By.xpath("//android.widget.TextView[@text='4G Calling']");

    public static By Verify4GCallingDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyWIFICalling = By.xpath("//android.widget.TextView[@text='Wi-Fi Calling']");
    public static By VerifyAccessPointName = By.xpath("//android.widget.TextView[@text='Access point names']");
    public static By VerifyAeroplaneMode = By.xpath("//android.widget.TextView[@text='Aeroplane mode']");
    public static By VerifyAeroplaneModeDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.Switch");

    public static By VerifyHotspotTethering = By.xpath("//android.widget.TextView[@text='Hotspot and tethering'] | //android.widget.TextView[@text='Hotspot & tethering']");

    public static By VerifyHotspotTetheringDetails = By.xpath("//android.widget.TextView[@text='Hotspot and tethering']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Hotspot & tethering']/following-sibling::android.widget.TextView[1]");
    public static By VerifyDataSaver = By.xpath("//android.widget.TextView[@text='Data Saver']");

    public static By VerifyDataSaverDetails = By.xpath("//android.widget.TextView[@text='Data Saver']/following-sibling::android.widget.TextView[1]");

    public static By VerifyVPN = By.xpath("//android.widget.TextView[@text='VPN']");

    public static By VerifyVPNDetails = By.xpath("//android.widget.TextView[@text='VPN']/following-sibling::android.widget.TextView[1]");


    public static By VerifyMobilePlan = By.xpath("//android.widget.TextView[@text='Mobile plan']");

    public static By VerifyPrivateDNS = By.xpath("//android.widget.TextView[@text='Private DNS']");

    public static By VerifyPrivateDNSDetails = By.xpath("//android.widget.TextView[@text='Private DNS']/following-sibling::android.widget.TextView[1]");

    public static By VerifyInternetConnectivityChecks = By.xpath("//android.widget.TextView[@text='Internet connectivity checks']");

    public static By VerifyInternetConnectivityChecksDetails = By.xpath("//android.widget.TextView[@text='Internet connectivity checks']/following-sibling::android.widget.TextView[1]");

    public static By VerifyAttestationKeyProvisioning = By.xpath("//android.widget.TextView[@text='Attestation key provisioning']");

    public static By VerifyAttestationKeyProvisioningDetails = By.xpath("//android.widget.TextView[@text='Attestation key provisioning']/following-sibling::android.widget.TextView[1]");

    public static By VerifyInternetConnectivityChecksScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Internet connectivity checks\"]");

    public static By VerifyGrapheneOSServer = By.xpath("//android.widget.TextView[@text='GrapheneOS server']");

    public static By VerifyStandardGoogleServer = By.xpath("//android.widget.TextView[@text='Standard (Google) server']");

    public static By VerifyDisabled = By.xpath("//android.widget.TextView[@text='Disabled']");

    public static By VerifyAttestationKeyProvisioningScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Attestation key provisioning\"]");

    public static By VerifyEnabledGrapheneOSProxy = By.xpath("//android.widget.TextView[@text='Enabled (GrapheneOS proxy)']");
    public static By VerifyEnabledGoogleServer = By.xpath("//android.widget.TextView[@text='Enabled (Google server)']");

    //******* Connected Devices *********

    public static By VerifyConnectedDevices = By.xpath("//android.widget.TextView[@text='Connected devices']");
    public static By VerifyConnectedDevicesDetails = By.xpath("//android.widget.TextView[@text='Connected devices']/following-sibling::android.widget.TextView[1]");

    public static By VerifyConnectedDevicesScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Connected devices\"]");

    public static By VerifyUSB = By.xpath("//android.widget.TextView[@text='USB']");
    public static By VerifyUSBDetails = By.xpath("//android.widget.TextView[@text='USB']/following-sibling::android.widget.TextView[1]");
    public static By VerifyPairNewDevice = By.xpath("//android.widget.TextView[@text='Pair new device']");
    public static By VerifyPairNewDeviceScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Pair new device\"]");
    public static By VerifyPhonesBluetoothAddress = By.xpath("//android.widget.TextView[contains(@text, \"Phone's Bluetooth address:\")]");

    public static By VerifySavedDevices = By.xpath("//android.widget.TextView[@text='Saved devices']");
    public static By VerifySavedDeviceSeeAll = By.xpath("//android.widget.TextView[@text='See all']");
    public static By VerifySavedDevicesScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Saved devices\"]");
    public static By VerifyConnectionPreferences = By.xpath("//android.widget.TextView[@text='Connection preferences']");
    public static By VerifyConnectionPreferencesDetails = By.xpath("//android.widget.TextView[@text='Connection preferences']/following-sibling::android.widget.TextView[1]");

//******* Apps *********

        public static By VerifyApps = By.xpath("//android.widget.TextView[@text='Apps']");
    public static By VerifyAppsDetails = By.xpath("//android.widget.TextView[@text='Apps']/following-sibling::android.widget.TextView[1]");
    public static By VerifyAppsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Apps\"]");

    public static By VerifyAllApps = By.xpath("//android.widget.TextView[@text='All apps']");
    public static By VerifyAllAppsDetails = By.xpath("//android.widget.TextView[@text='All apps']/following-sibling::android.widget.TextView[1]");
    public static By VerifyDefaultApps = By.xpath("//android.widget.TextView[@text='Default apps']");
    public static By VerifyDefaultAppsDetails = By.xpath("//android.widget.TextView[@text='Default apps']/following-sibling::android.widget.TextView[1]");

    public static By VerifyUnusedApps = By.xpath("//android.widget.TextView[@text='Unused apps']");
    public static By VerifyUnusedAppsDetails = By.xpath("//android.widget.TextView[@text='Unused apps']/following-sibling::android.widget.TextView[1]");

    public static By VerifySpecialAppAccess = By.xpath("//android.widget.TextView[@text='Special app access']");
    public static By VerifySpecialAppAccessDetails = By.xpath("//android.widget.TextView[@text='Special app access']/following-sibling::android.widget.TextView[1]");

    public static By VerifySandBoxedGooglePlay = By.xpath("//android.widget.TextView[@text='Sandboxed Google Play']");


    //******* Notifications *********

    public static By VerifyNotifications = By.xpath("//android.widget.TextView[@text='Notifications']");
    public static By VerifyNotificationsDetails = By.xpath("//android.widget.TextView[@text='Notifications']/following-sibling::android.widget.TextView[1]");
    public static By VerifyNotificationsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Notifications\"]");
    public static By VerifyManage = By.xpath("//android.widget.TextView[@text='Manage']");
    public static By VerifyAppSettings = By.xpath("//android.widget.TextView[@text='App settings'] | //android.widget.TextView[@text='App notifications']");
    public static By VerifyAppSettingsDetails = By.xpath("//android.widget.TextView[@text='App settings']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='App notifications']/following-sibling::android.widget.TextView[1]");
    public static By VerifyAppNotificationsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"App notifications\"] | //android.widget.TextView[@text='App notifications']");

    public static By VerifyNotificationHistory = By.xpath("//android.widget.TextView[@text='Notification history']");
    public static By VerifyNotificationHistoryDetails = By.xpath("//android.widget.TextView[@text='Notification history']/following-sibling::android.widget.TextView[1]");

    public static By VerifyUseNotificationHistory = By.xpath("//android.widget.TextView[@text='Use notification history']");

    public static By VerifyNotificationHistoryScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Notification history\"]");
    public static By VerifyConversation = By.xpath("//android.widget.TextView[@text='Conversation']");
    public static By VerifyConversations = By.xpath("//android.widget.TextView[@text='Conversations']");
    public static By VerifyConversationsDetails = By.xpath("//android.widget.TextView[@text='Conversations']/following-sibling::android.widget.TextView[1]");

    public static By VerifyConversationsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Conversations\"]");

    public static By VerifyBubbles = By.xpath("//android.widget.TextView[@text='Bubbles']");
    public static By VerifyBubblesDetails = By.xpath("//android.widget.TextView[@text='Bubbles']/following-sibling::android.widget.TextView[1]");

    public static By VerifyBubblesScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Bubbles\"]");

    public static By VerifyAllowAppsToShowBubbles = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyPrivacy = By.xpath("//android.widget.TextView[@text='Privacy']");

    public static By VerifyDeviceAppNotifications = By.xpath("//android.widget.TextView[@text='Device and app notifications'] | //android.widget.TextView[@text='Notification read, reply and control'] | //android.widget.TextView[@text='Notification read, reply & control']");
    public static By VerifyDeviceAppNotificationsDetails = By.xpath("//android.widget.TextView[@text='Device and app notifications']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Notification read, reply and control']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Notification read, reply & control']/following-sibling::android.widget.TextView[1]");

    public static By VerifyDeviceAndAppNotificationScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Notification read, reply and control\"] | //android.widget.FrameLayout[@content-desc=\"Notification read, reply & control\"]");

    public static By VerifyAllowed = By.xpath("//android.widget.TextView[@text='Allowed']");

    public static By VerifyNotAllowed = By.xpath("//android.widget.TextView[@text='Not allowed']");

    public static By VerifyAudioWillPlayOn = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Audio will play on\"]");
    public static By VerifyAudioWillPlayOnDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Audio will play on\"]/following-sibling::android.widget.TextView[1]");


//    public static By VerifyFlashNotifications = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Flash notifications\"]");
//    public static By VerifyFlashNotificationsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Flash notifications\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyNotificationsOnLockScreen = By.xpath("//android.widget.TextView[@text='Notifications on lock screen']");
    public static By VerifyNotificationsOnLockScreenDetails = By.xpath("//android.widget.TextView[@text='Notifications on lock screen']/following-sibling::android.widget.TextView[1]");
    public static By VerifyGeneral = By.xpath("//android.widget.TextView[@text='General']");
    public static By VerifyDoNotDisturb = By.xpath("//android.widget.TextView[@text='Do Not Disturb']");
    public static By VerifyDoNotDisturbDetails = By.xpath("//android.widget.TextView[@text='Do Not Disturb']/following-sibling::android.widget.TextView[1]");

    public static By VerifyDoNotDisturbScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Do Not Disturb\"]");
    public static By VerifyTurnOnNow = By.xpath("//android.widget.Button[@text='TURN ON NOW']");

    public static By VerifyWhoCanInterruptDoNotDisturb = By.xpath("//android.widget.TextView[@text='What can interrupt Do Not Disturb']");

    public static By VerifyPeople = By.xpath("//android.widget.TextView[@text='People']");
    public static By VerifyPeopleDetails = By.xpath("//android.widget.TextView[@text='People']/following-sibling::android.widget.TextView[1]");
    public static By VerifyPeopleScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"People\"]");

    public static By VerifyTheWhoCanInterrupt = By.xpath("//android.widget.TextView[@text='Who can interrupt']");

    public static By VerifyMessages = By.xpath("//android.widget.TextView[@text='Messages']");
    public static By VerifyMessagesDetails = By.xpath("//android.widget.TextView[@text='Messages']/following-sibling::android.widget.TextView[1]");

    public static By VerifyTheCalls = By.xpath("//android.widget.TextView[@text='Calls']");
    public static By VerifyTheCallsDetails = By.xpath("//android.widget.TextView[@text='Calls']/following-sibling::android.widget.TextView[1]");

    public static By VerifyTheApps = By.xpath("//android.widget.TextView[@text='Apps']");
    public static By VerifyTheAppsDetails = By.xpath("//android.widget.TextView[@text='Apps']/following-sibling::android.widget.TextView[1]");

    public static By VerifyAlarmsAndOtherInterruptions = By.xpath("//android.widget.TextView[@text='Alarms and other interruptions'] | //android.widget.TextView[@text='Alarms & other interruptions']");
    public static By VerifyAlarmsAndOtherInterruptionsDetails = By.xpath("//android.widget.TextView[@text='Alarms and other interruptions']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Alarms & other interruptions']/following-sibling::android.widget.TextView[1]");
    public static By VerifyAlarmsAndOtherInterruptionsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Alarms and other interruptions\"] | //android.widget.FrameLayout[@content-desc=\"Alarms & other interruptions\"]");

    public static By VerifyTheAlarms = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Alarms\"]");

    public static By VerifyTheAlarmsButton = By.xpath("(//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[1]");

    public static By VerifyMediaSounds = By.xpath("//android.widget.TextView[@text='Media sounds']");
    public static By VerifyMediaSoundsDetails = By.xpath("//android.widget.TextView[@text='Media sounds']/following-sibling::android.widget.TextView[1]");

    public static By VerifyMediaSoundsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyTouchSounds = By.xpath("//android.widget.TextView[@text='Touch sounds']");
    public static By VerifyTouchSoundsDetails = By.xpath("//android.widget.TextView[@text='Touch sounds']/following-sibling::android.widget.TextView[1]");

    public static By VerifyTouchSoundsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyTheReminders = By.xpath("//android.widget.TextView[@text='Reminders']");

    public static By VerifyTheRemindersButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyTheCalendarEvents = By.xpath("//android.widget.TextView[@text='Calendar events']");

    public static By VerifyTheCalendarEventsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyTheGeneral = By.xpath("//android.widget.TextView[@text='General']");

    public static By VerifySchedules = By.xpath("//android.widget.TextView[@text='Schedules']");
    public static By VerifySchedulesDetails = By.xpath("//android.widget.TextView[@text='Schedules']/following-sibling::android.widget.TextView[1]");

    public static By VerifySchedulesScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Schedules\"]");

    public static By VerifySleeping = By.xpath("//android.widget.TextView[@text='Sleeping']");
    public static By VerifySleepingDetails = By.xpath("//android.widget.TextView[@text='Sleeping']/following-sibling::android.widget.TextView[1]");

    public static By VerifySleepingDetailsButton = By.xpath("//android.widget.Switch[@content-desc=\"Sleeping\"]");

    public static By VerifyEvents = By.xpath("//android.widget.TextView[@text='Event']");
    public static By VerifyEventsDetails = By.xpath("//android.widget.TextView[@text='Event']/following-sibling::android.widget.TextView[1]");

    public static By VerifyEventsDetailsButton = By.xpath("//android.widget.Switch[@content-desc=\"Event\"]");

    public static By VerifyAdMore = By.xpath("//android.widget.TextView[@text='Add more']");

    public static By VerifyDurationForQuickSettings = By.xpath("//android.widget.TextView[@text='Duration for Quick Settings']");
    public static By VerifyDurationForQuickSettingsDetails = By.xpath("//android.widget.TextView[@text='Duration for Quick Settings']/following-sibling::android.widget.TextView[1]");

    public static By VerifyDisplayOptionsForHiddenNotifications = By.xpath("//android.widget.TextView[@text='Display options for hidden notifications'] | //android.widget.TextView[@text='Display options for filtered notifications']");
    public static By VerifyDisplayOptionsForHiddenNotificationsDetails = By.xpath("//android.widget.TextView[@text='Display options for hidden notifications']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Display options for filtered notifications']/following-sibling::android.widget.TextView[1]");

    public static By VerifyDisplayOptionsForHiddenNotificationsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Display options for hidden notifications\"] | //android.widget.FrameLayout[@content-desc=\"Display options for filtered notifications\"]");

    public static By VerifyWhenDoNotDisturbIsOn = By.xpath("//android.widget.TextView[@text='When Do Not Disturb is on']");


    public static By VerifyNoSoundFromNotifications = By.xpath("//android.widget.TextView[@text='No sound from notifications']");
    public static By VerifyNoSoundFromNotificationsDetails = By.xpath("//android.widget.TextView[@text='No sound from notifications']/following-sibling::android.widget.TextView[1]");

    public static By VerifyNoSoundFromNotificationsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.RadioButton");

    public static By VerifyNoVisualsOrSoundFromNotifications = By.xpath("//android.widget.TextView[@text='No visuals or sound from notifications']");
    public static By VerifyNoVisualsOrSoundFromNotificationsDetails = By.xpath("//android.widget.TextView[@text='You won’t see or hear notifications']");

    public static By VerifyNoVisualsOrSoundFromNotificationsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.RadioButton");

    public static By VerifyCustom = By.xpath("//android.widget.TextView[@text='Custom']");
    public static By VerifyCustomDetails = By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]");

    public static By VerifyCustomDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.RadioButton");
    public static By VerifyCustomRestrictionsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Custom restrictions\"]");

    public static By VerifyWhenTheScreenIsOff = By.xpath("//android.widget.TextView[@text='When the screen is off']");

    public static By VerifyDontHaveTurnONScreen = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView");

    public static By VerifyDontHaveTurnONScreenButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.CheckBox");

    public static By VerifyDontWakeForNotifications = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView");

    public static By VerifyDontWakeForNotificationsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.CheckBox");

    public static By VerifyWhenTheScreenIsOn = By.xpath("//android.widget.TextView[@text='When the screen is on']");

    public static By VerifyHideNotificationsDotsOnAppIcons = By.xpath("//android.widget.TextView[@text='Hide notification dots on app icons']");

    public static By VerifyHideNotificationsDotsOnAppIconsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.CheckBox");
    public static By VerifyHideStatusBarIconsAtTopOfScreen = By.xpath("//android.widget.TextView[@text='Hide status bar icons at top of screen']");

    public static By VerifyHideStatusBarIconsAtTopOfScreenButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.CheckBox");
    public static By VerifyDontPopNotificationsOnScreen = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.RelativeLayout/android.widget.TextView");
    public static By VerifyDontPopNotificationsOnScreenButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.CheckBox");
    public static By VerifyHideFromPullDownShade = By.xpath("//android.widget.TextView[@text='Hide from pull-down shade']");
    public static By VerifyHideFromPullDownShadeButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.LinearLayout/android.widget.CheckBox");
    public static By VerifyWirelessEmergencyAlerts = By.xpath("//android.widget.TextView[@text='Wireless emergency alerts']");
    public static By VerifyWirelessEmergencyAlertsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Wireless emergency alerts\"]");

    public static By VerifyAllowAlerts = By.xpath("//android.widget.TextView[@text='Allow alerts']");
    public static By VerifyAllowAlertsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyAlerts = By.xpath("//android.widget.TextView[@text='Alerts']");

    public static By VerifyPresidentialAlerts = By.xpath("//android.widget.TextView[@text='Presidential alerts']");
    public static By VerifyPresidentialAlertsDetails = By.xpath("//android.widget.TextView[@text='Presidential alerts']/following-sibling::android.widget.TextView[1]");

    public static By VerifyPresidentialAlertsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyExtremeThreats = By.xpath("//android.widget.TextView[@text='Extreme threats']");
    public static By VerifyExtremeThreatsDetails = By.xpath("//android.widget.TextView[@text='Extreme threats']/following-sibling::android.widget.TextView[1]");

    public static By VerifyExtremeThreatsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifySevereThreats = By.xpath("//android.widget.TextView[@text='Severe threats']");
    public static By VerifySevereThreatsDetails = By.xpath("//android.widget.TextView[@text='Severe threats']/following-sibling::android.widget.TextView[1]");

    public static By VerifySevereThreatsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyAmberAlerts = By.xpath("//android.widget.TextView[@text='AMBER alerts']");
    public static By VerifyAmberAlertsDetails = By.xpath("//android.widget.TextView[@text='AMBER alerts']/following-sibling::android.widget.TextView[1]");

    public static By VerifyAmberAlertsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.Switch | /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyTestAlerts = By.xpath("//android.widget.TextView[@text='Test alerts']");
    public static By VerifyTestAlertsDetails = By.xpath("//android.widget.TextView[@text='Test alerts']/following-sibling::android.widget.TextView[1]");

    public static By VerifyTestAlertsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.Switch | /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyAreaUpdateBroadCasts = By.xpath("//android.widget.TextView[@text='Area update broadcasts']");
    public static By VerifyAreaUpdateBroadCastsDetails = By.xpath("//android.widget.TextView[@text='Area update broadcasts']/following-sibling::android.widget.TextView[1]");

    public static By VerifyAreaUpdateBroadCastsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyEmergencyAlertHistory = By.xpath("//android.widget.TextView[@text='Emergency alert history']");

    public static By VerifyAlertPreferences = By.xpath("//android.widget.TextView[@text='Alert preferences']");


    public static By VerifyVibration = By.xpath("//android.widget.TextView[@text='Vibration']");
    public static By VerifyVibrationDetails = By.xpath("//android.widget.TextView[@text='Vibration']/following-sibling::android.widget.TextView[1]");

    public static By VerifyVibrationDetailsButton = By.xpath("(//android.widget.Switch[@resource-id=\"android:id/switch_widget\"])[5]");


    public static By VerifyAlertReminder = By.xpath("//android.widget.TextView[@text='Alert reminder']");
    public static By VerifyAlertReminderDetails = By.xpath("//android.widget.TextView[@text='Alert reminder']/following-sibling::android.widget.TextView[1]");

    public static By VerifyHideSilentNotificationsInStatusBar = By.xpath("//android.widget.TextView[@text='Hide silent notifications in status bar']");

    public static By VerifyHideSilentNotificationsInStatusBarButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyAllowNotificationSnoozing = By.xpath("//android.widget.TextView[@text='Allow notification snoozing']");

    public static By VerifyAllowNotificationSnoozingButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyNotificationDotOnAppIcon = By.xpath("//android.widget.TextView[@text='Notification dot on app icon']");

    public static By VerifyNotificationDotOnAppIconButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyEnhancedNotifications = By.xpath("//android.widget.TextView[@text='Enhanced notifications']");
    public static By VerifyEnhancedNotificationsDetails = By.xpath("//android.widget.TextView[@text='Enhanced notifications']/following-sibling::android.widget.TextView[1]");

    public static By VerifyEnhancedNotificationsButton = By.xpath("//android.widget.Switch[@content-desc=\"Enhanced notifications\"] | /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[10]/android.widget.LinearLayout/android.widget.Switch");


    //******* Battery *********

    public static By VerifyTheBattery = By.xpath("//android.widget.TextView[@text='Battery']");
    public static By VerifyTheBatteryDetails = By.xpath("//android.widget.TextView[@text='Battery']/following-sibling::android.widget.TextView[1]");

    public static By VerifyBatteryScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Battery\"]");

    public static By VerifyBatteryUsage = By.xpath("//android.widget.TextView[@text='Battery usage']");
    public static By VerifyBatteryUsageDetails = By.xpath("//android.widget.TextView[@text='Battery usage']/following-sibling::android.widget.TextView[1]");

    public static By VerifyBatterySaver = By.xpath("//android.widget.TextView[@text='Battery Saver']");
    public static By VerifyBatterySaverDetails = By.xpath("//android.widget.TextView[@text='Battery Saver']/following-sibling::android.widget.TextView[1]");

    public static By VerifyBatteryManager = By.xpath("//android.widget.TextView[@text='Battery Manager']");
    public static By VerifyBatteryManagerDetails = By.xpath("//android.widget.TextView[@text='Battery Manager']/following-sibling::android.widget.TextView[1]");

    public static By VerifyBatteryPercentage = By.xpath("//android.widget.TextView[@text='Battery percentage']");
    public static By VerifyBatteryPercentageDetails = By.xpath("//android.widget.TextView[@text='Battery percentage']/following-sibling::android.widget.TextView[1]");

    public static By VerifyBatterySaverScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Battery Saver\"]");
    public static By VerifyUserBatterySaver = By.xpath("//android.widget.TextView[@resource-id=\"com.android.settings:id/switch_text\"]");

    public static By VerifySetASchedule = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Set a schedule\"]");
    public static By VerifySetAScheduleDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Set a schedule\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyTurnoffAtNinty = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Turn off at 90%\"]");
    public static By VerifyTurnoffAtNintyDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Turn off at 90%\"]/following-sibling::android.widget.TextView[1]");
    public static By VerifyTurnoffAtNintyButton = By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"]");

    public static By VerifyBatteryManagerScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Battery Manager\"]");

    public static By VerifyUserBatteryManager = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Use Battery Manager\"]");
    public static By VerifyUserBatteryManagerDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Use Battery Manager\"]/following-sibling::android.widget.TextView[1]");
    public static By VerifyUserBatteryManagerButton = By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"]");


    //******* Storage *********

    public static By VerifyTheStorage = By.xpath("//android.widget.TextView[@text='Storage']");
    public static By VerifyTheStorageDetails = By.xpath("//android.widget.TextView[@text='Storage']/following-sibling::android.widget.TextView[1]");

    public static By VerifyStorageScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Storage\"]");

    public static By VerifyFreeUpSpace = By.xpath("//android.widget.TextView[@text='Free up space']");
    public static By VerifyFreeUpSpaceDetails = By.xpath("//android.widget.TextView[@text='Free up space']/following-sibling::android.widget.TextView[1]");

    public static By VerifySystem = By.xpath("//android.widget.TextView[@text='System']");
    public static By VerifySystemDetails = By.xpath("//android.widget.TextView[@text='System']/following-sibling::android.widget.TextView[1]");


    public static By VerifyTotalMemory = By.xpath("//android.widget.TextView[@resource-id='com.android.settings:id/total_summary']");
    public static By VerifyUsageMemory = By.xpath("//android.widget.TextView[@resource-id='com.android.settings:id/usage_summary']");

    public static By VerifyStorageApps = By.xpath("//android.widget.TextView[@text='Apps']");
    public static By VerifyStorageAppsDetails = By.xpath("//android.widget.TextView[@text='Apps']/following-sibling::android.widget.TextView[1]");

    public static By VerifyImages = By.xpath("//android.widget.TextView[@text='Images']");
    public static By VerifyImagesDetails = By.xpath("//android.widget.TextView[@text='Images']/following-sibling::android.widget.TextView[1]");

    public static By VerifyBin = By.xpath("//android.widget.TextView[@text='Bin']");
    public static By VerifyBinDetails = By.xpath("//android.widget.TextView[@text='Bin']/following-sibling::android.widget.TextView[1]");

    public static By VerifyDocumentsAndOther = By.xpath("//android.widget.TextView[@text='Documents and other']");
    public static By VerifyDocumentsAndOtherDetails = By.xpath("//android.widget.TextView[@text='Documents and other']/following-sibling::android.widget.TextView[1]");

    public static By VerifyGames = By.xpath("//android.widget.TextView[@text='Games']");
    public static By VerifyGamesDetails = By.xpath("//android.widget.TextView[@text='Games']/following-sibling::android.widget.TextView[1]");
    public static By VerifyAudio = By.xpath("//android.widget.TextView[@text='Audio']");
    public static By VerifyAudioDetails = By.xpath("//android.widget.TextView[@text='Audio']/following-sibling::android.widget.TextView[1]");
    public static By VerifyVideo = By.xpath("//android.widget.TextView[@text='Videos']");
    public static By VerifyVideoDetails = By.xpath("//android.widget.TextView[@text='Videos']/following-sibling::android.widget.TextView[1]");

    //******* Sound and Vibration *********

    public static By VerifySoundAndVibration = By.xpath("//android.widget.TextView[@text='Sound and vibration'] | //android.widget.TextView[@text='Sound & vibration']");

    public static By VerifySoundAndVibrationDetails = By.xpath("//android.widget.TextView[@text='Sound and vibration']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Sound & vibration']/following-sibling::android.widget.TextView[1]");

    public static By VerifySoundAndVibrationScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Sound and vibration\"] | //android.widget.FrameLayout[@content-desc=\"Sound & vibration\"]");

    public static By VerifyMediaVolume = By.xpath("//android.widget.TextView[@text='Media volume']");
    public static By VerifyMediaVolumeDetails = By.xpath("//android.widget.SeekBar[@content-desc=\"Media volume\"]");

    public static By VerifyCallVolume = By.xpath("//android.widget.TextView[@text='Call volume']");
    public static By VerifyCallVolumeDetails = By.xpath("//android.widget.SeekBar[@content-desc=\"Call volume\"]");
    public static By VerifyRingVolume = By.xpath("//android.widget.TextView[@text='Ring volume']");
    public static By VerifyRingVolumeDetails = By.xpath("//android.widget.SeekBar[@content-desc=\"Ring volume\"]");

    public static By VerifyNotificationVolume = By.xpath("//android.widget.TextView[@text='Notification volume']");
    public static By VerifyNotificationVolumeDetails = By.xpath("//android.widget.SeekBar[@content-desc=\"Notification volume\"]");



    public static By VerifyAlarmVolume = By.xpath("//android.widget.TextView[@text='Alarm volume']");
    public static By VerifyAlarmVolumeDetails = By.xpath("//android.widget.SeekBar[@content-desc=\"Alarm volume\"]");

    public static By VerifyPhoneRingtone= By.xpath("//android.widget.TextView[@text='Phone ringtone']");
    public static By VerifyPhoneRingtoneDetails = By.xpath("//android.widget.TextView[@text='Phone ringtone']/following-sibling::android.widget.TextView[1]");
    public static By VerifyPhoneRingtoneScreen = By.xpath("//android.widget.TextView[@text='Phone ringtone']");
    public static By VerifyPhoneRingtoneAdd= By.xpath("//android.widget.TextView[@text='Add ringtone']");
    public static By VerifyPhoneRingtoneCancel= By.xpath("//android.widget.Button[@text='CANCEL']");
    public static By VerifyPhoneRingtoneOK= By.xpath("//android.widget.Button[@text='OK']");
    public static By VerifyMedia= By.xpath("//android.widget.TextView[@text='Media']");
    public static By VerifyMediaDetails = By.xpath("//android.widget.TextView[@text='Media']/following-sibling::android.widget.TextView[1]");
    public static By VerifyMediaScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Media\"]");

    public static By VerifyPinMediaPlayer = By.xpath("//android.widget.TextView[@text='Pin media player']");
    public static By VerifyPinMediaPlayerDetails = By.xpath("//android.widget.TextView[@text='Pin media player']/following-sibling::android.widget.TextView[1]");

    public static By VerifyPinMediaPlayerDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyShowMediaOnLockScreen = By.xpath("//android.widget.TextView[@text='Show media on lock screen']");
    public static By VerifyShowMediaOnLockScreenDetails = By.xpath("//android.widget.TextView[@text='Show media on lock screen']/following-sibling::android.widget.TextView[1]");

    public static By VerifyShowMediaOnLockScreenDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch | (//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[1]");

    public static By VerifyShowMediaRecommendations = By.xpath("//android.widget.TextView[@text='Show Assistant media recommendations']");
    public static By VerifyShowMediaRecommendationsDetails = By.xpath("//android.widget.TextView[@text='Show Assistant media recommendations']/following-sibling::android.widget.TextView[1]");

    public static By VerifyShowMediaRecommendationsDetailsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyVibrationAndHaptics= By.xpath("//android.widget.TextView[@text='Vibration and haptics'] | //android.widget.TextView[@text='Vibration & haptics']");
    public static By VerifyVibrationAndHapticsDetails = By.xpath("//android.widget.TextView[@text='Vibration and haptics']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Vibration & haptics']/following-sibling::android.widget.TextView[1]");
    public static By VerifyVibrationAndHapticsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Vibration and haptics\"] | //android.widget.FrameLayout[@content-desc=\"Vibration & haptics\"]");

    public static By VerifyUseVibrationAndHaptics = By.xpath("//android.widget.TextView[@text='Use vibration and haptics'] | //android.widget.TextView[@text='Use vibration & haptics']");
    public static By VerifyUseVibrationAndHapticsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifySoundAndVibrationCalls = By.xpath("//android.widget.TextView[@text='Calls']");
    public static By VerifyRingVibration = By.xpath("//android.widget.TextView[@text='Ring vibration']");

    public static By VerifyRingVibrationButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyVibrateFirstThenRingGradually = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Vibrate first then ring gradually\"]");

    public static By VerifyVibrateFirstThenRingGraduallyButton = By.xpath("(//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[2]");
    public static By VerifyNotificationsAndAlarms = By.xpath("//android.widget.TextView[@text='Notifications and alarms']");


    public static By VerifyNotificationVibration = By.xpath("//android.widget.TextView[@text='Notification vibration']");

    public static By VerifyNotificationVibrationButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyAlarmVibration = By.xpath("//android.widget.TextView[@text='Alarm vibration']");

    public static By VerifyAlarmVibrationButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyInteractiveHaptics = By.xpath("//android.widget.TextView[@text='Interactive haptics']");

    public static By VerifyTouchFeedBack = By.xpath("//android.widget.TextView[@text='Touch feedback']");

    public static By VerifyTouchFeedBackButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyMediaVibration = By.xpath("//android.widget.TextView[@text='Media vibration']");

    public static By VerifyMediaVibrationButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyShortcutToPreventRinging = By.xpath("//android.widget.TextView[@text='Shortcut to prevent ringing']");
    public static By VerifyShortcutToPreventRingingDetails = By.xpath("//android.widget.TextView[@text='Shortcut to prevent ringing']/following-sibling::android.widget.TextView[1]");
    public static By VerifyShortcutToPreventRingingButton = By.xpath("//android.widget.Switch[@content-desc=\"Shortcut to prevent ringing\"]");

    public static By VerifyDefaultNotificationSound= By.xpath("//android.widget.TextView[@text='Default notification sound']");
    public static By VerifyDefaultNotificationSoundDetails = By.xpath("//android.widget.TextView[@text='Default notification sound']/following-sibling::android.widget.TextView[1]");

  public static By VerifyDefaultNotificationSoundAdd= By.xpath("//android.widget.TextView[@text='Add notification']");

    public static By VerifyDefaultAlarmSound= By.xpath("//android.widget.TextView[@text='Default alarm sound']");
    public static By VerifyDefaultAlarmSoundDetails = By.xpath("//android.widget.TextView[@text='Default alarm sound']/following-sibling::android.widget.TextView[1]");

    public static By VerifyDefaultAlarmSoundAdd= By.xpath("//android.widget.TextView[@text='Add alarm']");

    public static By VerifyDialPadTones = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Dial pad tones\"]");

    public static By VerifyDialPadTonesButton = By.xpath("(//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[2]");
    public static By VerifyScreenLockingSound = By.xpath("//android.widget.TextView[@text='Screen locking sound']");

    public static By VerifyScreenLockingSoundButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyChargingSoundsAndVibration = By.xpath("//android.widget.TextView[@text='Charging sounds and vibration']");

    public static By VerifyChargingSoundsAndVibrationButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyTheTouchSounds = By.xpath("//android.widget.TextView[@text='Touch sounds'] | //android.widget.TextView[@text='Tap & click sounds']");

    public static By VerifyTheTouchSoundsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyAlwaysShowIconWhenInVibrateMode = By.xpath("//android.widget.TextView[@text='Always show icon when in vibrate mode']");

    public static By VerifyAlwaysShowIconWhenInVibrateModeButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.LinearLayout/android.widget.Switch");


    //******* Display *********

    public static  By verifyDisplay = By.xpath("//android.widget.TextView[@text='Display']");
    public static By verifyDisplayDetails = By.xpath("//android.widget.TextView[@text='Display']/following-sibling::android.widget.TextView[1]");
    public static By VerifyLiftToWake = By.xpath("//android.widget.TextView[@text='Lift to wake']");
    public static By VerifyColour= By.xpath("//android.widget.TextView[@text='Colour'] | //android.widget.TextView[@text='Color']");
    public static By VerifyLiftToWakeButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[11]/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyThePreview = By.xpath("//android.widget.Button[@text='Preview'] | //android.widget.TextView[@text='Preview']");
    public static By VerifyTheClock = By.xpath("//android.widget.TextView[@text='Clock']");

    public static By VerifyTheCustomize = By.xpath("//android.widget.Button[@text='CUSTOMISE']");

    public static By VerifyChooseAScreenSaver = By.xpath("//android.widget.TextView[@text='Choose a screen saver']");

    public static  By verifyWhenToStart = By.xpath("//android.widget.TextView[@text='When to start']");

    public static By verifyWhenToStartDetails = By.xpath("//android.widget.TextView[@text='When to start']/following-sibling::android.widget.TextView[1]");

    public static By VerifyUseScreenSaver = By.xpath("//android.widget.TextView[@text='Use screen saver']");

    public static By VerifyUseScreenSaverButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyScreenSaverScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Screen saver\"]");

    public static  By settingsScreenSaver = By.xpath("//android.widget.TextView[@text='Screen saver']");
    public static By settingsScreenSaverDetails = By.xpath("//android.widget.TextView[@text='Screen saver']/following-sibling::android.widget.TextView[1]");
    public static By VerifyAutoRotateScreen = By.xpath("//android.widget.TextView[@text='Auto-rotate screen']");

    public static By VerifyAutoRotateScreenButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyOtherDisplayControls = By.xpath("//android.widget.TextView[@text='Other display controls']");

    public static By VerifyColours= By.xpath("//android.widget.TextView[@text='Colours'] | //android.widget.TextView[@text='Colors']");

    public static  By verifyColourContrast = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Colour contrast\"]");
    public static By verifyColourContrastDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Colour contrast\"]/following-sibling::android.widget.TextView[1]");

    public static By verifyColourContrastScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Colour contrast\"]");

    public static By VerifyTheHighContrastText = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"High-contrast text\"]");
    public static By VerifyTheHighContrastTextDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"High-contrast text\"]/following-sibling::android.widget.TextView[1]");
    public static By VerifyTheHighContrastTextButton = By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"]");



    public static By VerifyNightLight = By.xpath("//android.widget.TextView[@text='Night Light']");
    public static By VerifyNightLightDetails = By.xpath("//android.widget.TextView[@text='Night Light']/following-sibling::android.widget.TextView[1]");
    public static By VerifyNightLightButton = By.xpath("//android.widget.Switch[@content-desc=\"Night Light\"]");

    public static By VerifyDisplayScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Display\"]");

    public static By VerifyBrightness = By.xpath("//android.widget.TextView[@text='Brightness']");

    public static  By verifyBrightnessLevel= By.xpath("//android.widget.TextView[@text='Brightness level']");
    public static By verifyBrightnessLevelDetails = By.xpath("//android.widget.TextView[@text='Brightness level']/following-sibling::android.widget.TextView[1]");

    public static By VerifyAdaptiveBrightness = By.xpath("//android.widget.TextView[@text='Adaptive brightness']");
    public static By VerifyAdaptiveBrightnessButton = By.xpath("//android.widget.Switch[@content-desc=\"Adaptive brightness\"]");

    public static By VerifyLockDisplay = By.xpath("//android.widget.TextView[@text='Lock display']");
    public static  By verifyLockScreen= By.xpath("//android.widget.TextView[@text='Lock screen']");
    public static By verifyLockScreenDetails = By.xpath("//android.widget.TextView[@text='Lock screen']/following-sibling::android.widget.TextView[1]");

    public static By VerifyLockScreenScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Lock screen\"]");

    public static By VerifyWhatToShow = By.xpath("//android.widget.TextView[@text='What to show']");

    public static  By verifyPrivacy= By.xpath("//android.widget.TextView[@text='Privacy']");
    public static By verifyPrivacyDetails = By.xpath("//android.widget.TextView[@text='Privacy']/following-sibling::android.widget.TextView[1]");

    public static  By verifyAddTextOnLockScreen= By.xpath("//android.widget.TextView[@text='Add text on lock screen']");
    public static By verifyAddTextOnLockScreenDetails = By.xpath("//android.widget.TextView[@text='Add text on lock screen']/following-sibling::android.widget.TextView[1]");

    public static  By verifyShowDeviceControls= By.xpath("//android.widget.TextView[@text='Use device controls']");
    public static By verifyShowDeviceControlsDetails = By.xpath("//android.widget.TextView[@text='Use device controls']/following-sibling::android.widget.TextView[1]");

    public static  By verifyControlFromLockedDevice= By.xpath("//android.widget.TextView[@text='Control from locked device']");
    public static By verifyControlFromLockedDeviceDetails = By.xpath("//android.widget.TextView[@text='Control from locked device']/following-sibling::android.widget.TextView[1]");
    public static By VerifyDoubleLineClick = By.xpath("//android.widget.TextView[@text='Double-line clock']");
    public static By VerifyDoubleLineClickDetails = By.xpath("//android.widget.TextView[@text='Double-line clock']/following-sibling::android.widget.TextView[1]");
    public static By VerifyDoubleLineClickButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyWhenToShow = By.xpath("//android.widget.TextView[@text='When to show']");

    public static By VerifyWakeScreenForNotifications = By.xpath("//android.widget.TextView[@text='Wake screen for notifications']");
    public static By VerifyWakeScreenForNotificationsDetails = By.xpath("//android.widget.TextView[@text='Wake screen for notifications']/following-sibling::android.widget.TextView[1]");
    public static By VerifyWakeScreenForNotificationsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.LinearLayout/android.widget.Switch");

    public static  By verifyScreenTimeOut= By.xpath("//android.widget.TextView[@text='Screen timeout']");
    public static By verifyScreenTimeOutDetails = By.xpath("//android.widget.TextView[@text='Screen timeout']/following-sibling::android.widget.TextView[1]");

    public static By VerifyScreenTimeOutScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Screen timeout\"]");

    public static By VerifyAppearance = By.xpath("//android.widget.TextView[@text='Appearance']");

    public static By VerifyDarkTheme = By.xpath("//android.widget.TextView[@text='Dark theme']");
    public static By VerifyDarkThemeDetails = By.xpath("//android.widget.TextView[@text='Dark theme']/following-sibling::android.widget.TextView[1]");
    public static By VerifyDarkThemeButton = By.xpath("//android.widget.Switch[@content-desc=\"Dark theme\"]");

    public static By VerifyDisplaySizeAndText = By.xpath("//android.widget.TextView[@text='Display size and text']");

    public static By VerifyDisplaySizeAndTextScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Display size and text\"]");

    public static By VerifyPreviewDisplaySizeAndText = By.xpath("//android.widget.TextView[@text='Preview']");

    public static  By verifyFontSize= By.xpath("//android.widget.TextView[@text='Font size']");
    public static By verifyFontSizeDetails = By.xpath("//android.widget.TextView[@text='Font size']/following-sibling::android.widget.TextView[1]");

    public static  By verifyDisplaySize= By.xpath("//android.widget.TextView[@text='Display size']");
    public static By verifyDisplaySizeDetails = By.xpath("//android.widget.TextView[@text='Display size']/following-sibling::android.widget.TextView[1]");
//    public static  By verifyDisplaySize= By.xpath("//android.widget.TextView[@text='Display size']");
//    public static By verifyDisplaySizeDetails = By.xpath("//android.widget.TextView[@text='Display size']/following-sibling::android.widget.TextView[1]");

    public static By VerifyBoldText = By.xpath("//android.widget.TextView[@text='Bold text']");

    public static By VerifyBoldTextButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyHighContrastText = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"High contrast text\"]");
    public static By VerifyHighContrastTextDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"High contrast text\"]/following-sibling::android.widget.TextView[1]");
    public static By VerifyHighContrastTextButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyResetSettings= By.xpath("//android.widget.Button[@text='RESET SETTINGS']");
    public static By VerifyDefaultScreenTimeOut = By.xpath("//android.widget.TextView[@text='1 minute']");

    public static By VerifyDefaultScreenTimeOutButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.RadioButton");

//    **************** Accessibility********************

    public static By VerifyAccessibility = By.xpath("//android.widget.TextView[@text='Accessibility']");
    public static By VerifyAccessibilityDetails = By.xpath("//android.widget.TextView[@text='Accessibility']/following-sibling::android.widget.TextView[1]");

    public static By VerifyAccessibilityScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Accessibility\"]");
    public static By VerifyDownloadApps = By.xpath("//android.widget.TextView[@text='Downloaded apps']");

    public static By VerifyDownloadedApps = By.xpath("//android.widget.TextView[@text='Downloaded apps']");

    public static By VerifyPunktLauncher = By.xpath("//android.widget.TextView[@text='Punkt Launcher'] | //android.widget.TextView[@text='App notifications']");
    public static By VerifyPunktLauncherDetails = By.xpath("//android.widget.TextView[@text='Punkt Launcher']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='App notifications']/following-sibling::android.widget.TextView[1]");

    public static By VerifyTestAccessibilityService = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Test accessibility service\"]");
    public static By VerifyTestAccessibilityServiceDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Test accessibility service\"]/following-sibling::android.widget.TextView[1]");
    public static By VerifyTestAccessibilityServiceScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Test accessibility service\"]");
    public static By VerifyUseTestAccessibilityService = By.xpath("//android.widget.TextView[@resource-id=\"com.android.settings:id/switch_text\"]");
    public static By VerifyTestAccessibilityServiceShortcut = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Test accessibility service shortcut\"]");

    public static By VerifyTestAccessibilityServiceShortcutDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Test accessibility service shortcut\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyAccessibilityScreenReader = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Screen reader\"]");

    public static By VerifyTalkBack = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"TalkBack\"]");
    public static By VerifyTalkBackDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"TalkBack\"]/following-sibling::android.widget.TextView[1]");
    public static By VerifyTalkBackScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"TalkBack\"]");
    public static By VerifyUseTalkBack = By.xpath("//android.widget.TextView[@resource-id=\"com.android.settings:id/switch_text\"]");
    public static By VerifyTalkBackShortcut = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"TalkBack shortcut\"]");


    public static By VerifyPunktLauncherScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Punkt Launcher\"]");

    public static By VerifyUsePunktLauncher = By.xpath("//android.widget.TextView[@text='Use Punkt Launcher']");

    public static By VerifyOptions = By.xpath("//android.widget.TextView[@text='Options']");
    public static By VerifyPunktLauncherShortcut = By.xpath("//android.widget.TextView[@text='Punkt Launcher shortcut']");

    public static By VerifyPunktLauncherShortcutDetails = By.xpath("//android.widget.TextView[@text='Punkt Launcher shortcut']/following-sibling::android.widget.TextView[1]");

    public static By VerifyAppInfo = By.xpath("//android.widget.TextView[@text='App info']");
    public static By VerifyAccessibilityDisplay = By.xpath("//android.widget.TextView[@text='Display']");

    public static By VerifyColorAndMotion = By.xpath("//android.widget.TextView[@text='Color and motion'] ");

    public static By VerifyColorAndMotionScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Color and motion\"]");


    public static By VerifyColourAndCorrections = By.xpath("//android.widget.TextView[@text='Color correction']");
    public static By VerifyColourAndCorrectionsDetails = By.xpath("//android.widget.TextView[@text='Color correction']/following-sibling::android.widget.TextView[1]");

    public static By VerifyColourAndInversion = By.xpath("//android.widget.TextView[@text='Color inversion']");
    public static By VerifyColourAndInversionDetails = By.xpath("//android.widget.TextView[@text='Color inversion']/following-sibling::android.widget.TextView[1]");

    public static By VerifyRemoveAnimations = By.xpath("//android.widget.TextView[@text='Remove animations']");
    public static By VerifyRemoveAnimationsDetails = By.xpath("//android.widget.TextView[@text='Remove animations']/following-sibling::android.widget.TextView[1]");
    public static By VerifyRemoveAnimationsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.Switch");

    public static By VerifyLargeMouseCursor = By.xpath("//android.widget.TextView[@text='Large mouse pointer']");
    public static By VerifyLargeMouseCursorDetails = By.xpath("//android.widget.TextView[@text='Large mouse pointer']/following-sibling::android.widget.TextView[1]");
    public static By VerifyLargeMouseCursorButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyExtraDim = By.xpath("//android.widget.TextView[@text='Extra dim']");
    public static By VerifyExtraDimDetails = By.xpath("//android.widget.TextView[@text='Extra dim']/following-sibling::android.widget.TextView[1]");
    public static By VerifyExtraDimButton = By.xpath("//android.widget.Switch[@content-desc=\"Extra dim\"]");
    public static By VerifyMagnification = By.xpath("//android.widget.TextView[@text='Magnification'] ");
    public static By VerifyMagnificationDetails = By.xpath("//android.widget.TextView[@text='Magnification']/following-sibling::android.widget.TextView[1]");

    public static By VerifyMagnificationScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Magnification\"]");
    public static By VerifyMagnificationZoomIn = By.xpath("//android.widget.TextView[@text='Quickly zoom in on the screen to make content larger'] ");
    public static By VerifyMagnificationZoomInDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[2]");

    public static By VerifyMagnificationShortCut = By.xpath("//android.widget.TextView[@text='Magnification shortcut']");
    public static By VerifyMagnificationShortCutDetails = By.xpath("//android.widget.TextView[@text='Magnification shortcut']/following-sibling::android.widget.TextView[1]");
    public static By VerifyMagnificationShortCutButton = By.xpath("//android.widget.Switch[@content-desc=\"Shortcut settings\"]");

    public static By VerifyMagnificationType = By.xpath("//android.widget.TextView[@text='Magnification type'] ");
    public static By VerifyMagnificationTypeDetails = By.xpath("//android.widget.TextView[@text='Magnification type']/following-sibling::android.widget.TextView[1]");

    public static By VerifyMagnifySwitchingApps = By.xpath("//android.widget.TextView[@text='Keep on while switching apps']");
    public static By VerifyMagnifySwitchingAppsDetails = By.xpath("//android.widget.TextView[@text='Keep on while switching apps']/following-sibling::android.widget.TextView[1]");
    public static By VerifyMagnifySwitchingAppsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyMagnifyTyping = By.xpath("//android.widget.TextView[@text='Magnify typing']");
    public static By VerifyMagnifyTypingDetails = By.xpath("//android.widget.TextView[@text='Magnify typing']/following-sibling::android.widget.TextView[1]");
    public static By VerifyMagnifyTypingButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.Switch");


    public static By VerifyInteractionControls = By.xpath("//android.widget.TextView[@text='Interaction controls'] ");

    public static By VerifyAccessibilityMenu = By.xpath("//android.widget.TextView[@text='Accessibility Menu'] ");
    public static By VerifyAccessibilityMenuDetails = By.xpath("//android.widget.TextView[@text='Accessibility Menu']/following-sibling::android.widget.TextView[1]");
    public static By VerifyAccessibilityMenuScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Accessibility Menu\"]");

    public static By VerifyAccessibilityMenuContext = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView ");
    public static By VerifyAccessibilityMenuContextDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[2]");


    public static By VerifyAccessibilityMenuShortCut = By.xpath("//android.widget.TextView[@text='Accessibility Menu shortcut']");
    public static By VerifyAccessibilityMenuShortCutDetails = By.xpath("//android.widget.TextView[@text='Accessibility Menu shortcut']/following-sibling::android.widget.TextView[1]");
    public static By VerifyAccessibilityMenuShortCutButton = By.xpath("//android.widget.Switch[@content-desc=\"Shortcut settings\"]");

    public static By VerifyNone = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"None\"]");
    public static By VerifySwipe = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Swipe\"]");
    public static By VerifyPIN = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"PIN\"]");
    public static By VerifyPassword = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Password\"]");


    public static By VerifySettings = By.xpath("//android.widget.TextView[@text='Settings']");

    public static By VerifyTimingControls = By.xpath("//android.widget.TextView[@text='Timing controls']");
    public static By VerifyTimingControlsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Timing controls\"]");

    public static By VerifyTouchAndHoldDelay = By.xpath("//android.widget.TextView[@text='Touch and hold delay'] | //android.widget.TextView[@text='Touch & hold delay']");
    public static By VerifyTouchAndHoldDelayDetails = By.xpath("//android.widget.TextView[@text='Touch and hold delay']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Touch & hold delay']/following-sibling::android.widget.TextView[1]");

    public static By VerifyTimeToTakeAction = By.xpath("//android.widget.TextView[@text='Time to take action (Accessibility timeout)'] ");
    public static By VerifyTimeToTakeActionDetails = By.xpath("//android.widget.TextView[@text='Time to take action (Accessibility timeout)']/following-sibling::android.widget.TextView[1]");


    public static By VerifyAutoClick = By.xpath("//android.widget.TextView[@text='Autoclick (dwell timing)'] ");
    public static By VerifyAutoClickDetails = By.xpath("//android.widget.TextView[@text='Autoclick (dwell timing)']/following-sibling::android.widget.TextView[1]");

    public static By VerifySystemControls = By.xpath("//android.widget.TextView[@text='System controls']");
    public static By VerifySystemControlsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"System controls\"]");


    public static By VerifyNavigationMode = By.xpath("//android.widget.TextView[@text='Navigation mode'] ");
    public static By VerifyNavigationModeDetails = By.xpath("//android.widget.TextView[@text='Navigation mode']/following-sibling::android.widget.TextView[1]");

    public static By VerifyPowerButtonEndsCall = By.xpath("//android.widget.TextView[@text='Power button ends call']");

    public static By VerifyPowerButtonEndsCallButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyAccessibilityAutoRotateScreen = By.xpath("//android.widget.TextView[@text='Auto-rotate screen']");

    public static By VerifyAccessibilityAutoRotateScreenButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Switch");



    public static By VerifyProgramKeyControl = By.xpath("//android.widget.TextView[@text='Program Key Control']");
    public static By VerifyProgramKeyControlScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Program Key Control\"]");

    public static By VerifyCaptions = By.xpath("//android.widget.TextView[@text='Program Key Control']");

    public static By VerifyCaptionPreference = By.xpath("//android.widget.TextView[@text='Caption preferences']");
    public static By VerifyCaptionPreferenceScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Caption preferences\"]");
    public static By VerifyCaptionPreferenceDetails = By.xpath("//android.widget.TextView[@text='Caption preferences']/following-sibling::android.widget.TextView[1]");

    public static By VerifyCaptionPreferenceContext = By.xpath("//android.widget.TextView[@text='Customize caption size and style to make them easier to read'] ");
    public static By VerifyCaptionPreferenceContextDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ImageView[2]");

    public static By VerifyShowCaptions = By.xpath("//android.widget.TextView[@text='Show captions']");

    public static By VerifyShowCaptionsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Switch");
    public static By VerifyCaptionSizeAndText = By.xpath("//android.widget.TextView[@text='Caption size and style'] ");
    public static By VerifyCaptionSizeAndTextDetails = By.xpath("//android.widget.TextView[@text='Caption size and style']/following-sibling::android.widget.TextView[1]");

    public static By VerifyMoreOptions = By.xpath("//android.widget.TextView[@text='More options']");

    public static By VerifyAudioDescription = By.xpath("//android.widget.TextView[@text='Audio description']");
    public static By VerifyAudioDescriptionDetails = By.xpath("//android.widget.TextView[@text='Audio description']/following-sibling::android.widget.TextView[1]");
    public static By VerifyAudioDescriptionButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout[2]/android.widget.Switch");


    public static By VerifyFlashNotifications = By.xpath("//android.widget.TextView[@text='Flash notifications'] ");
    public static By VerifyFlashNotificationsDetails = By.xpath("//android.widget.TextView[@text='Flash notifications']/following-sibling::android.widget.TextView[1]");


    public static By VerifyFlashNotificationsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Flash notifications\"]");


    public static By VerifyFlashNotificationContext = By.xpath("//android.widget.TextView[@text='Flash the camera light or the screen when you receive notifications or when alarms sound'] ");
    public static By VerifyFlashNotificationContextImage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ImageView[2]");

    public static By VerifyCameraFlash = By.xpath("//android.widget.TextView[@text='Camera flash']");

    public static By VerifyCameraFlashButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch");

    public static By VerifyScreenFlash = By.xpath("//android.widget.TextView[@text='Screen flash']");
    public static By VerifyScreenFlashDetails = By.xpath("//android.widget.TextView[@text='Screen flash']/following-sibling::android.widget.TextView[1]");

    public static By VerifyScreenFlashButton = By.xpath("//android.widget.Switch[@content-desc=\"Screen flash\"]");

    public static By VerifyHearingDevices = By.xpath("//android.widget.TextView[@text='Hearing devices'] ");
    public static By VerifyHearingDevicesDetails = By.xpath("//android.widget.TextView[@text='Hearing devices']/following-sibling::android.widget.TextView[1]");


    public static By VerifyHearingDevicesScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Hearing devices\"]");


    public static By VerifyHearingDevicesContext = By.xpath("//android.widget.TextView[@text='Set up and manage ASHA and LE Audio hearing aids, cochlear implants, and other amplification devices'] ");


    public static By VerifyAccessibilityPairNewDevice = By.xpath("//android.widget.TextView[@text='Pair new device'] ");
    public static By VerifyAccessibilityPairNewDeviceDetails = By.xpath("//android.widget.TextView[@text='Pair new device']/following-sibling::android.widget.TextView[1]");


    public static By VerifyHearingDeviceShortCut = By.xpath("//android.widget.TextView[@text='Hearing device shortcut']");
    public static By VerifyHearingDeviceShortCutDetails = By.xpath("//android.widget.TextView[@text='Hearing device shortcut']/following-sibling::android.widget.TextView[1]");

    public static By VerifyHearingDeviceShortCutButton = By.xpath("//android.widget.Switch[@content-desc=\"Shortcut settings\"]");

    public static By VerifyAudioAdjustment = By.xpath("//android.widget.TextView[@text='Audio adjustment']");
    public static By VerifyAudioAdjustmentScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Audio adjustment\"]");

    public static By VerifyMonoAudio= By.xpath("//android.widget.TextView[@text='Mono audio']");
    public static By VerifyMonoAudioDetails = By.xpath("//android.widget.TextView[@text='Mono audio']/following-sibling::android.widget.TextView[1]");

    public static By VerifyMonoAudioButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch");



    public static By VerifyAudioBalance = By.xpath("//android.widget.TextView[@text='Audio balance'] ");
    public static By VerifyAudioBalanceSeekBar = By.xpath("//android.widget.SeekBar[@text='100.0']");
    public static By VerifyAudioBalanceSeekBarLeft = By.xpath("//android.widget.TextView[@text='Left'] ");
    public static By VerifyAudioBalanceSeekBarRight = By.xpath("//android.widget.TextView[@text='Right']");



    public static By VerifyAccessibilityShortcut = By.xpath("//android.widget.TextView[@text='Accessibility shortcuts']");
    public static By VerifyAccessibilityShortcutScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Accessibility shortcuts\"]");


    public static By VerifyAccessibilityButton = By.xpath("//android.widget.TextView[@text='Accessibility button'] ");
    public static By VerifyAccessibilityButtonDetails = By.xpath("//android.widget.TextView[@text='Accessibility button']/following-sibling::android.widget.TextView[1]");


    public static By VerifyShortcutFromLockScreen= By.xpath("//android.widget.TextView[@text='Shortcut from lock screen']");
    public static By VerifyShortcutFromLockScreenDetails = By.xpath("//android.widget.TextView[@text='Shortcut from lock screen']/following-sibling::android.widget.TextView[1]");

    public static By VerifyShortcutFromLockScreenButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch");


    //******* Location *********

    public static By VerifyLocation = By.xpath("//android.widget.TextView[@text='Location']");
    public static By VerifyLocationDetails = By.xpath("//android.widget.TextView[@text='Location']/following-sibling::android.widget.TextView[1]");

    public static By VerifyLocationScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Location\"]");


    public static By VerifyUseLocation = By.xpath("//android.widget.TextView[@resource-id=\"com.android.settings:id/switch_text\"]");


    public static By VerifyUseLocationButton = By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]");

    public static By VerifyAppLocationPermissions = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"App location permissions\"]");
    public static By VerifyAppLocationPermissionsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"App location permissions\"]/following-sibling::android.widget.TextView[1]");
    public static By VerifyLocationServices = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Location services\"]");
    public static By VerifySUPL = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Secure User Plane Location (SUPL)\"]");
    public static By VerifySUPLDefaultValue = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Secure User Plane Location (SUPL)\"]/following-sibling::android.widget.TextView[1]");
    public static By VerifyPSDS = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Predicted Satellite Data Service (PSDS)\"]");
    public static By VerifyPSDSDefaultValue = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Predicted Satellite Data Service (PSDS)\"]/following-sibling::android.widget.TextView[1]");
    public static By VerifySUPLScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Secure User Plane Location (SUPL)\"]");
    public static By VerifyPSDSScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Predicted Satellite Data Service (PSDS)\"]");

    public static By SUPLStatusDefaultValue = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"GrapheneOS proxy\"]");
    public static By selectStandardServer = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Standard server\"]");
    public static By selectOff = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]");
    public static By selectGrapheneOSProxy = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"GrapheneOS proxy\"]");

    public static By SUPLStatusDefaultCheckBox = By.xpath("(//android.widget.RadioButton[@resource-id=\"android:id/checkbox\"])[1]");

    public static By PSDSStatusDefaultValue = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Standard server\"]");

    public static By PSDSStatusDefaultCheckBox = By.xpath("(//android.widget.RadioButton[@resource-id=\"android:id/checkbox\"])[2]");

    public static By locationBack = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

    public static By selectGrapheneOSServer = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"GrapheneOS server\"]");


    //******* Security and Privacy *********

    public static By VerifySecurityAndPrivacy = By.xpath("//android.widget.TextView[@text='Security & privacy'] | //android.widget.TextView[@text='Security and privacy']");
    public static By VerifySecurityAndPrivacyDetails = By.xpath("//android.widget.TextView[@text='Security and privacy']/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Security & privacy']/following-sibling::android.widget.TextView[1]");

    public static By VerifySecurityAndPrivacyScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Security & privacy\"] | //android.widget.FrameLayout[@content-desc=\"Security and privacy\"]");

    public static By VerifyDeviceMayBeAtRisk = By.xpath("//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/status_title\"]");
    public static By VerifyDeviceMayBeAtRiskDetails = By.xpath("//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/status_title\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifySetAScreenLock = By.xpath("//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/issue_card_title\"]");
    public static By VerifySetAScreenLockDetails = By.xpath("//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/issue_card_title\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyDeviceUnLock = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Device unlock\"]");
    public static By VerifyDeviceUnLockDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Device unlock\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyDeviceUnLockScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Device unlock\"]");

    public static By VerifyScreenLock = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Screen lock\"]");
    public static By VerifyScreenLockDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Screen lock\"]/following-sibling::android.widget.TextView[1] ");
    public static By VerifySetScreenLock = By.xpath("//android.widget.Button[@text=\"Set screen lock\"]");
    public static By VerifySetScreenLockScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Choose a screen lock\"]");

    public static By VerifyFingerprint = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Fingerprint\"]");
    public static By VerifyFingerprintDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Fingerprint\"]/following-sibling::android.widget.TextView[1] ");


    public static By VerifyPrivacyControls= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Privacy controls\"]");
    public static By VerifyPrivacyControlsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Privacy controls\"]/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Security & privacy']/following-sibling::android.widget.TextView[1]");

    public static By VerifyPrivacyControlsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Privacy controls\"]");

    public static By VerifyPermissionManager= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Permission manager\"]");
    public static By VerifyPermissionManagerDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Permission manager\"]/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Security & privacy']/following-sibling::android.widget.TextView[1]");

    public static By VerifyPermissionManagerScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Permission manager\"]");

    public static By VerifyHealthConnect= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Health Connect\"]");
    public static By VerifyHealthConnectDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Health Connect\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyHealthConnectScreen = By.xpath("//android.widget.TextView[@resource-id=\"com.android.healthconnect.controller:id/onboarding_title\"]");


    public static By VerifyDataSharingUpdatesForLocation= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Data sharing updates for location\"]");
    public static By VerifyDataSharingUpdatesForLocationDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Data sharing updates for location\"]/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@text='Security & privacy']/following-sibling::android.widget.TextView[1]");

    public static By VerifyDataSharingUpdatesForLocationScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Data sharing updates for location\"]");


    public static By VerifyControls = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Controls\"]");

    public static By VerifyCameraAccess = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Camera access\"]");
    public static By VerifyCameraAccessDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Camera access\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyCameraAccessButton = By.xpath("(//android.widget.Switch[@resource-id=\"android:id/switch_widget\"])[1]");

    public static By VerifyMicroPhoneAccess = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Microphone access\"]");
    public static By VerifyMicroPhoneAccessDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Microphone access\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyMicroPhoneAccessButton = By.xpath("(//android.widget.Switch[@resource-id=\"android:id/switch_widget\"])[2]");

    public static By VerifyShowClipBoardAccess = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Show clipboard access\"]");
    public static By VerifyShowClipBoardAccessDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Show clipboard access\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyShowClipBoardAccessButton = By.xpath("(//android.widget.Switch[@resource-id=\"android:id/switch_widget\"])[3]");


    public static By VerifyShowPassWords = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Show passwords\"]");
    public static By VerifyShowPassWordsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Show passwords\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyShowPassWordsButton = By.xpath("(//android.widget.Switch[@resource-id=\"android:id/switch_widget\"])[4]");

    public static By VerifyLocationAccess= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Location access\"]");
    public static By VerifyLocationAccessDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Location access\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyLocationAccessScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Location\"]");

    public static By VerifyPrivacyDashBoard= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Privacy dashboard\"]");
    public static By VerifyPrivacyDashBoardDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Privacy dashboard\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyPrivacyDashBoardScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Privacy dashboard\"]");

    public static By VerifyExploitProtection= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Exploit protection\"]");
    public static By VerifyExploitProtectionDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Exploit protection\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyPrivateSpace= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Private space\"]");
    public static By VerifyPrivateSpaceDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Private space\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyOtherSettings = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Other settings\"]");

    public static By VerifyMoreSecurityAndPrivacy= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"More security & privacy\"] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"More security and privacy\"]");
    public static By VerifyMoreSecurityAndPrivacyDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"More security & privacy\"]/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"More security and privacy\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyMoreSecurityAndPrivacyScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"More security & privacy\"] | //android.widget.FrameLayout[@content-desc=\"More security and privacy\"]");

    public static By VerifyAllowSensorsPermission = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Allow Sensors permission to apps by default\"]");
    public static By VerifyAllowSensorsPermissionDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Allow Sensors permission to apps by default\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyAllowSensorsPermissionButton = By.xpath("(//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[2]");

    public static By VerifySaveScreenshotTimestampEXIF = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Save screenshot timestamp to EXIF\"]");
    public static By VerifySaveScreenshotTimestampEXIFDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Save screenshot timestamp to EXIF\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifySaveScreenshotTimestampEXIFButton = By.xpath("(//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[3]");




    public static By VerifyAllowCameraSoftwareExtensions = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Allow camera software extensions\"]");
    public static By VerifyAllowCameraSoftwareExtensionsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Allow camera software extensions\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyAllowCameraSoftwareExtensionsButton = By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]");
    public static By VerifySecurity = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Security\"]");

    public static By VerifyDeviceAdminApps= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Device admin apps\"]");
    public static By VerifyDeviceAdminAppsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Device admin apps\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyDeviceAdminAppsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Device admin apps\"]");


    public static By VerifySIMLock= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"SIM lock\"]");
//    public static By VerifySIMLockDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Device admin apps\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifySIMLockScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"SIM lock settings\"]");


    public static By VerifyLockSIM = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Lock SIM\"]");
    public static By VerifyLockSIMDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Lock SIM\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyLockSIMButton = By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"]");



    public static By VerifyChangeSIMPIN = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Change SIM PIN\"]");

    public static By VerifyEncryptionAndCredentials= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Encryption & credentials\"] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Encryption and credentials\"]");
    public static By VerifyEncryptionAndCredentialsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Encryption & credentials\"]/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Encryption and credentials\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyEncryptionAndCredentialsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Encryption & credentials\"] | //android.widget.FrameLayout[@content-desc=\"Encryption and credentials\"]");


    public static By VerifyEncryption = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Encryption\"]");


    public static By VerifyEncryptPhone= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Encrypt phone\"]");
    public static By VerifyEncryptPhoneDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Encrypt phone\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyCredentialStorage = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Credential storage\"]");

    public static By VerifyTrustedCredentials= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Trusted credentials\"]");
    public static By VerifyTrustedCredentialsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Trusted credentials\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyTrustedCredentialsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Trusted credentials\"]");


    public static By VerifyOnSystem = By.xpath("//android.widget.LinearLayout[@content-desc=\"System\"]");
    public static By VerifyUser = By.xpath("//android.widget.LinearLayout[@content-desc=\"User\"]");

    public static By VerifyUserCredentials= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"User credentials\"]");
    public static By VerifyUserCredentialsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"User credentials\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyUserCredentialsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"User credentials\"]");

    public static By VerifyInstallACertificate= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Install a certificate\"]");
    public static By VerifyInstallACertificateDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Install a certificate\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyInstallACertificateScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Install a certificate\"]");

    public static By VerifyCACertificate = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"CA certificate\"]");

    public static By VerifyVPNAndAppUserCertificate = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"VPN & app user certificate\"]");
    public static By VerifyWiFiCertificate = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Wi‑Fi certificate\"]");


    public static By VerifyClearCredentials= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Clear credentials\"]");
    public static By VerifyClearCredentialsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Clear credentials\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyCertificateManagementApp= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Certificate management app\"]");
    public static By VerifyCertificateManagementAppDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Certificate management app\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyTrustAgent= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Trust agents\"]");
    public static By VerifyTrustAgentDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Trust agents\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyAppPinning= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"App pinning\"]");
    public static By VerifyAppPinningDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"App pinning\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyAppPinningScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"App pinning\"]");


    public static By VerifyUseAppPinning = By.xpath("//android.widget.TextView[@resource-id=\"com.android.settings:id/switch_text\"]");
    public static By VerifyUseAppPinningButton = By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]");

    public static By VerifyLockDeviceWhenPinning = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Lock device when unpinning\"]");
    public static By VerifyLockDeviceWhenPinningButton = By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"]");



    //******* Safety and Emergency *********

    public static By VerifySafetyAndEmergency = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Safety & emergency\"] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Safety and emergency\"]");
    public static By VerifySafetyAndEmergencyDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Safety & emergency\"]/following-sibling::android.widget.TextView[1] | //android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Safety and emergency\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifySafetyAndEmergencyScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Safety & emergency\"] | //android.widget.FrameLayout[@content-desc=\"Safety and emergency\"]");

    public static By VerifyEmergencyInformation = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Emergency information\"]");

    public static By VerifyEmergencySOS = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Emergency SOS\"]");
    public static By VerifyEmergencySOSDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Emergency SOS\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyEmergencyInformationScreen = By.xpath("//android.widget.TextView[@text=\"Emergency information\"]");


    public static By VerifyAddInformation = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Add information\"]");

    public static By VerifyEmergencyContacts = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Emergency contacts\"]");

    public static By VerifyAddContact = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Add contact\"]");

    public static By VerifyEmergencySOSScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Emergency SOS\"]");


    public static By VerifyUseEmergencySOS= By.xpath("//android.widget.TextView[@resource-id=\"com.android.settings:id/switch_text\"]");
    public static By VerifyUseEmergencySOSButton = By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]");

    public static By VerifyNotifyForHelp = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Notify for help\"]");

    public static By VerifyCallForHelp = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Call for help\"]");
    public static By VerifyCallForHelpDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Call for help\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyPlayCountDownAlarm= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Play countdown alarm\"]");
    public static By VerifyPlayCountDownAlarmDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Play countdown alarm\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyPlayCountDownAlarmButton = By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"]");

    //******* System *********


    public static By VerifySettingsSystem = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"System\"]");
    public static By VerifySettingsSystemDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"System\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifySettingsSystemScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"System\"]");

    public static By VerifyLanguages = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Languages\"]");
    public static By VerifyLanguagesDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Languages\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyLanguagesScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Languages\"]");
    public static By VerifyPreferredLanguage = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Preferred Language\"]");

    public static By VerifySystemLanguage = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"System Languages\"]");
    public static By VerifySystemLanguageDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"System Languages\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifySystemLanguageScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Languages\"]");
    public static By VerifyPreferredLanguageOrder = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Preferred language order\"]");
    public static By VerifyAddALanguage = By.xpath("//android.widget.Button[@resource-id=\"com.android.settings:id/add_language\"]");

    public static By VerifyAddALanguageScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Add a language\"]");


    public static By VerifyAppLanguages= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"App languages\"]");
    public static By VerifyAppLanguagesDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"App languages\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyAppLanguagesScreen = By.xpath("//android.widget.TextView[@text=\"App languages\"]");

    public static By VerifyRegionalPreferences= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Regional preferences\"]");
    public static By VerifyRegionalPreferencesDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Regional preferences\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyRegionalPreferencesScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Regional preferences\"]");


    public static By VerifyTemperature= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Temperature\"]");
    public static By VerifyTemperatureDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Temperature\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyTemperatureScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Temperature\"]");

    public static By VerifyUseDefault = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Use default\"]");

    public static By VerifyCelsius = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Celsius (°C)\"]");
    public static By VerifyFahrenheit = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Fahrenheit (°F)\"]");

    public static By VerifyFirstDayOfWeek= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"First day of week\"]");
    public static By VerifyFirstDayOfWeekDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"First day of week\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyFirstDayOfWeekScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"First day of week\"]");

    public static By VerifySpeech = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Speech\"]");

    public static By VerifyVoiceInput= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Voice input\"]");
    public static By VerifyVoiceInputDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Voice input\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyVoiceInputScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Voice input\"]");

    public static By VerifyKeyBoard= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Keyboard\"]");
    public static By VerifyKeyBoardDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Keyboard\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyKeyBoardScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Keyboard\"]");

    public static By VerifyOnScreenKeyBoard= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"On-screen keyboard\"]");
    public static By VerifyOnScreenKeyBoardDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"On-screen keyboard\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyOnScreenKeyBoardScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"On-screen keyboard\"]");

    public static By VerifyTools = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Tools\"]");


    public static By VerifySpellChecker= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Spell checker\"]");
    public static By VerifySpellCheckerDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Spell checker\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifySpellCheckerScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Spell checker\"]");


    public static By VerifyUseSpellChecker = By.xpath("//android.widget.TextView[@resource-id=\"com.android.settings:id/switch_text\"]");
    public static By VerifyUseSpellCheckerButton = By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]");

    public static By VerifyDefaultSpellChecker= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Default spell checker\"]");
    public static By VerifyDefaultSpellCheckerDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Default spell checker\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifySpellCheckerLanguages= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Languages\"]");
    public static By VerifySpellCheckerLanguagesDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Languages\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyPersonalDictionary= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Personal dictionary\"]");
    public static By VerifyPersonalDictionaryDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Personal dictionary\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyPersonalDictionaryScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Personal dictionary\"]");

    public static By VerifyPointerSpeed = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Pointer speed\"]");

    public static By VerifyRedirectVibration = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Redirect vibration\"]");
    public static By VerifyRedirectVibrationDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Redirect vibration\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyRedirectVibrationButton = By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"]");


    public static By VerifyGestures = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Gestures\"]");
    public static By VerifyGesturesScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Gestures\"]");

    public static By VerifyQuicklyOpenCamera= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Quickly open camera\"]");
    public static By VerifyQuicklyOpenCameraDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Quickly open camera\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyQuicklyOpenCameraScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Quickly open camera\"]");


    public static By VerifyToNavigationMode= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Navigation mode\"]");

    public static By VerifyNavigationModeScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Navigation mode\"]");


    public static By VerifyGestureNavigation = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Gesture navigation\"]");
    public static By VerifyGestureNavigationDetails = By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.android.settings:id/summary_container\"])[1]");

    public static By VerifyGestureNavigationButton = By.xpath("(//android.widget.ImageView[@content-desc=\"Settings\"])[1]");



    public static By Verify3ButtonNavigation = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"3-button navigation\"]");
    public static By Verify3ButtonNavigationDetails = By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.android.settings:id/summary_container\"])[2]");

    public static By Verify3ButtonNavigationButton = By.xpath("(//android.widget.ImageView[@content-desc=\"Settings\"])[2]");

    public static By VerifyPreventRinging = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Prevent ringing\"]");
    public static By VerifyPreventRingingDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Prevent ringing\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyPreventRingingButton = By.xpath("//android.widget.Switch[@content-desc=\"Prevent ringing\"]");


    public static By VerifyDateAndTime= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Date & time\"]");
    public static By VerifyDateAndTimeDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Date & time\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyDateAndTimeScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Date & time\"]");

    public static By VerifySetTimeAutomatically = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Set time automatically\"]");
    public static By VerifySetTimeAutomaticallyButton = By.xpath("(//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[1]");

    public static By VerifyDate= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Date\"]");
    public static By VerifyDateDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Date\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyTime= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Time\"]");
    public static By VerifyTimeDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Time\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyTimeZone = By.xpath("(//android.widget.TextView[@resource-id=\"android:id/title\"])[4]");

    public static By VerifySetAutomatically = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Set automatically\"]");
    public static By VerifySetAutomaticallyButton = By.xpath("(//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[2]");

    public static By VerifyOnTimeZone= By.xpath("(//android.widget.TextView[@resource-id=\"android:id/title\"])[6]");
    public static By VerifyTimeZoneDetails = By.xpath("(//android.widget.TextView[@resource-id=\"android:id/title\"])[6]/following-sibling::android.widget.TextView[1]");


    public static By VerifyTimeFormat = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Time format\"]");


    public static By VerifyUse24HourFormat = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Use 24-hour format\"]");
    public static By VerifyUse24HourFormatDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Use 24-hour format\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyUse24HourFormatButton = By.xpath("(//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[4]");

    public static By VerifyUseLocaleDefault = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Use locale default\"]");
    public static By VerifyUseLocaleDefaultButton = By.xpath("(//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[3]");


    public static By VerifyBackUp = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Backup\"]");
    public static By VerifyBackUpScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Backup\"]");

    public static By VerifySystemUpdates= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"System updates\"]");
    public static By VerifySystemUpdatesDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"System updates\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifySystemUpdatesScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"System update\"]");

    public static By VerifyCheckForUpdates= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Check for updates\"]");
    public static By VerifyCheckForUpdatesDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Check for updates\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyLastCheckForUpdates= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Last check for updates\"]");
    public static By VerifyLastCheckForUpdatesDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Last check for updates\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyBaseURL= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Base URL\"]");
    public static By VerifyBaseURLDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Base URL\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyReleaseChannel= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Release channel\"]");
    public static By VerifyReleaseChannelDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Release channel\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyPermittedNetworks= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Permitted networks\"]");
    public static By VerifyPermittedNetworksDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Permitted networks\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyRequireBatteryAboveWarningLevel = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Require battery above warning level\"]");
    public static By VerifyRequireBatteryAboveWarningLevelDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Require battery above warning level\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyRequireBatteryAboveWarningLevelButton = By.xpath("(//android.widget.Switch[@resource-id=\"android:id/switch_widget\"])[1]");


    public static By VerifyRequireDeviceToBeCharging= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Require device to be charging\"]");
    public static By VerifyRequireDeviceToBeChargingDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Require device to be charging\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyRequireDeviceToBeChargingButton = By.xpath("(//android.widget.Switch[@resource-id=\"android:id/switch_widget\"])[2]");

    public static By VerifyAutomaticReboot = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Automatic reboot\"]");
    public static By VerifyAutomaticRebootDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Automatic reboot\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyAutomaticRebootButton = By.xpath("(//android.widget.Switch[@resource-id=\"android:id/switch_widget\"])[3]");


    public static By VerifyNotificationsSettings= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Notification settings\"]");
    public static By VerifyNotificationsSettingsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Notification settings\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyNotificationsSettingsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"System Updater\"]");

    public static By VerifyAllSystemUpdaterNotifications = By.xpath("//android.widget.TextView[@resource-id=\"com.android.settings:id/switch_text\"]");
    public static By VerifyAllSystemUpdaterNotificationsButton = By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]");

    public static By VerifyErrorReporting = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Error reporting\"]");
    public static By VerifyErrorReportingButton = By.xpath("//android.widget.Switch[@content-desc=\"Error reporting\"]");

    public static By VerifyOther = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Other\"]");

    public static By VerifyUpdateProgress = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Update progress\"]");
    public static By VerifyUpdateProgressDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Update progress\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyUpdateProgressButton = By.xpath("//android.widget.Switch[@content-desc=\"Update progress\"]");


    public static By VerifyAlreadyUpToDate = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Already up to date\"]");
    public static By VerifyAlreadyUpToDateButton = By.xpath("//android.widget.Switch[@content-desc=\"Already up to date\"]");

    public static By VerifyRebootPrompt = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Reboot prompt\"]");
    public static By VerifyRebootPromptButton = By.xpath("//android.widget.Switch[@content-desc=\"Reboot prompt\"]");

    public static By VerifyAllowNotificationDot = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Allow notification dot\"]");
    public static By VerifyAllowNotificationDotButton = By.xpath("(//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"])[5]");

    public static By VerifyUsers= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Users\"]");
    public static By VerifyUsersDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Users\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyUsersScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Users\"]");

    public static By VerifyAllowMultipleUsers = By.xpath("//android.widget.TextView[@resource-id=\"com.android.settings:id/switch_text\"]");
    public static By VerifyAllowMultipleUsersButton = By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]");

    public static By VerifyYouOwner= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"You (Owner)\"]");
    public static By VerifyYouOwnerDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"You (Owner)\"]/following-sibling::android.widget.TextView[1]");




    public static By VerifyResetOptions = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Reset options\"]");
    public static By VerifyResetOptionsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Reset options\"]");

    public static By VerifyResetMobileNetworkSettings = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Reset Mobile Network Settings\"]");
    public static By VerifyResetMobileNetworkSettingsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Reset Mobile Network Settings\"]");

    public static By VerifyEraseESIMs= By.xpath("//android.widget.TextView[@text=\"Erase eSIMs\"]");
    public static By VerifyEraseESIMsDetails = By.xpath("//android.widget.TextView[@text=\"Erase eSIMs\"]/following-sibling::android.widget.TextView[1]");


    public static By VerifyResetBluetoothWiFi = By.xpath("//android.widget.TextView[@text=\"Reset Bluetooth & Wi‑Fi\"]");

    public static By VerifyResetAppPreferences = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Reset app preferences\"]");

    public static By VerifyErase_eSIMS = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Erase eSIMs\"]");

    public static By VerifyDeletePrivateSpace = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Delete private space\"]");
    public static By VerifyEraseAllDataFactoryReset = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Erase all data (factory reset)\"]");


    //******* Passwords, passkeys & accounts *********


    public static By VerifyPasswordsPasskeysAndAccounts = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Passwords, passkeys & accounts\"]");
    public static By VerifyPasswordsPasskeysAndAccountsDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Passwords, passkeys & accounts\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyPasswordsPasskeysAndAccountsScreen = By.xpath("//android.widget.FrameLayout[@content-desc=\"Passwords, passkeys & accounts\"]");

      public static By VerifyPreferredServices = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Preferred service\"]");

    public static By VerifyTheChange = By.xpath("//android.widget.Button[@resource-id=\"com.android.settings:id/change_button\"]");

    public static By VerifyAccountsForOwner = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Accounts for Owner\"]");

    public static By VerifyAddAccount= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Add account\"]");
    public static By VerifyAutomaticallySyncAppData= By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Automatically sync app data\"]");
    public static By VerifyAutomaticallySyncAppDataDetails = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Automatically sync app data\"]/following-sibling::android.widget.TextView[1]");

    public static By VerifyAutomaticallySyncAppDataButton = By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switchWidget\"]");

    public static By VerifyAphyAccount = By.xpath("//android.widget.TextView[@resource-id=\"android:id/summary\" and @text=\"Aphy Account\"]");
    public static By VerifyAphyAccountDetails= By.xpath("//android.widget.TextView[@resource-id=\"android:id/summary\" and @text=\"Aphy Account\"]/preceding-sibling::android.widget.TextView[1]");


}