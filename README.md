# TVault 27

TVault 27 is a mobile-first, offline-first trading journal packaged as a standalone Android app.

## Build APK
Every push to main starts the GitHub Actions workflow **Build TVault 27 APK**. Open the repository's Actions tab, open the latest successful run, and download the artifact named **TVault-27-Android-APK**. The APK is built from the bundled app and does not require a website host.

## App data
Trade records are stored locally on the phone in the app's WebView database. Export backups regularly from Settings. Clearing app data or uninstalling can erase local records; export a backup first.

## Scope
Journal and analytics only. No broker connection, order execution, investment advice, or cloud sync in this release.
