# RSS Brand Kit

Private single source of truth for Razeen Secure Solution (RSS) branding, global RSS KIT standards, common content, UI/UX rules, and reusable Android components.

## How RSS KIT Works

RSS KIT is the shared global standard for RSS projects.

**RSS KIT master rules → RSS project implementation → project-specific requirements**

Every RSS project inherits the current global RSS KIT rules. A project-specific requirement may override a global rule only when explicitly required for that project.

The master global rules are maintained in:

**`RSS_DEFAULT_RULES.md`**

This is a rules document, not a separate project and not a replacement for project source code.

When a new requirement is explicitly declared as a global RSS requirement:
1. Update `RSS_DEFAULT_RULES.md`.
2. Treat the updated rule as the RSS KIT standard for future RSS project work.
3. Apply the rule to existing projects when those projects are next updated or when a migration/update is explicitly requested.

RSS KIT does not magically modify already-built project code. It provides the authoritative standard that project implementation work must follow.

## Rule Priority

**Global RSS KIT defaults → project-specific requirements → latest explicit instruction**

A project-specific override applies only to that project unless the user explicitly promotes it to a global RSS KIT rule.

## Core RSS KIT Standards

- Modern, professional, lightweight, practical UI.
- Every app uses its own original project/app logo for app identity.
- Original RSS company logo is preserved unchanged and used only in designated company-branding areas.
- Animation is the default throughout the complete app experience, with restrained motion where appropriate.
- Slide navigation uses modern surfaces with subtle glass/blur treatment only; excessive glassmorphism is not allowed.
- Light / Dark / System appearance applies consistently across the complete app.
- Meaningful colorful icons are used where appropriate.
- Standard Settings, About, Contact, Privacy Policy, and Terms & Conditions patterns are provided.
- RSS Core and RAY standards are part of the RSS KIT baseline.
- Accessibility, responsive layouts, performance, and readable contrast are required.

## Standard App Experience

Where applicable, RSS apps follow:

**Splash → Registration/Create Account → Welcome → App Features → Main App**

The app's original logo is used on app-specific onboarding and branding surfaces.

## Global Account Standard

RSS KIT includes the shared RSS Core account behavior:

- Email registration and Google/Gmail sign-in.
- Terms acceptance is mandatory before Create Account is enabled.
- Verification email is sent as required.
- Users may enter the app while verification is pending.
- Verification-pending status includes the standard countdown and verification actions.
- Successful verification triggers the RSS Family Welcome email.
- Existing returning users receive a Welcome Back email rather than a new-registration Welcome email.
- Account state supports cloud and multi-device synchronization.

## Lock Screen Standard

Applicable RSS apps use the RSS KIT lock-screen standard:

- App's original logo.
- Clock/date.
- PIN indicator and keypad.
- Biometric authentication using an icon-only action.
- Forgot PIN/recovery.
- Failed-attempt and temporary-lockout states.
- Configurable re-lock timeout where applicable.
- Light / Dark / System.
- Subtle surfaces and animation without excessive glassmorphism.

## Premium and Platform Standard

- Premium apps provide a real Upgrade to Premium entry.
- Premium access is connected to RSS Core entitlement state.
- Entitlement follows the RSS account across supported reinstall/device-change scenarios.
- RSS Core and RAY are part of the shared platform baseline.
- Payments.lk is the target payment adapter unless explicitly changed.
- Play Billing is not the initial payment implementation unless explicitly required.

## Infrastructure Standard

Standard architecture:

**RSS App → RSS Core → RAY → Cloud / Project Services**

Cloudflare Workers are the preferred deployment/automation fallback when GitHub Actions limits or billing constraints prevent reliable execution.

No build, deployment, test, or verification result may be reported as successful unless it has actually been verified.

## Repository Structure

- `brand/` — canonical RSS branding tokens and logo guidance
- `common-content/` — reusable company/About/Contact/Terms/Privacy content
- `ui-rules/` — default RSS UI/UX standards
- `android/rss-common/` — reusable Android library source
- `templates/` — implementation templates
- `docs/` — integration and versioning guidance
- `RSS_DEFAULT_RULES.md` — authoritative global RSS KIT rule set

## Logo

The original Razeen Secure Solution logo must never be recolored, stretched, distorted, redesigned, or replaced with an AI-generated substitute.

The RSS company logo is not the default application logo. Each RSS application retains its own original app/project logo.

## Android Package

Shared library namespace:

`com.riyaz.rss.common`

RSS applications continue to use their own package IDs following:

`com.riyaz.<appname>`

## Versioning

The Brand Kit and Android library use semantic versioning:

`MAJOR.MINOR.PATCH`

Do not silently upgrade production projects to a breaking Brand Kit version.
