# RSS Default Rules

## Purpose
This file is the authoritative master rule set for all RSS projects. RSS projects inherit these global defaults unless a project-specific requirement explicitly overrides a rule.

## Rule Priority
1. RSS Default Rules (global)
2. Project-specific requirements
3. Latest explicit user instruction

A project-specific override applies only to that project.

## RSS KIT UI/UX
- Modern, professional, lightweight, practical UI.
- Use the project's own original app logo for Splash, Registration, Welcome, App Features, and main app branding.
- Never use the RSS company logo as the app logo.
- Preserve the original Razeen Secure Solution/RSS company logo exactly: no recoloring, stretching, distortion, redesign, or replacement.
- Use the RSS company logo only in designated company-branding areas such as the slide-menu footer and Settings/About/Contact/Privacy/Terms footer.
- Support the centralized RSS theme catalog defined below.
- Dark mode must avoid excessive glassmorphism; use subtle surfaces, borders, elevation, and readable contrast.
- Use meaningful colorful icons where appropriate, except where a selected neutral theme explicitly requires neutral treatment.
- Use restrained animation and micro-interactions throughout the app.
- Keep layouts responsive, accessible, performant, and easy to use.
- Standard app flow for all RSS projects: Splash Screen → App Features Animation Flow → Create Account / Login → Welcome Screen → Dashboard.

## Centralized RSS Theme Standard

All RSS projects use the centralized RSS theme catalog and behavior supplied by RSS Core.

### Theme catalog
- Material
- White
- Onyx
- Light
- Dark
- Black
- Auto — White + Onyx
- Auto — Light + Dark
- Auto — Light + Black
- System Default
- OLED Black
- Warm Light
- Cool Light
- High Contrast
- Dynamic Color

### Auto — White + Onyx
- Light state uses White surfaces with dark neutral text.
- Dark state uses Onyx surfaces with light neutral text.
- Onyx is a neutral black/charcoal palette.
- **Gold is not part of this theme.**
- Do not add gold buttons, gold highlights, gold backgrounds, gold icons, or gold decorative accents to White + Onyx.
- Auto mode follows the device/system light-dark state.
- Theme changes apply consistently to the app's supported surfaces, including navigation, settings, dialogs, cards, onboarding, and other RSS KIT surfaces.

### Branding separation
- Each app keeps its own original project logo for app-specific UI.
- The original Razeen Secure Solution company logo remains unchanged.
- Theme colors must never recolor, stretch, distort, or redraw the RSS company logo.
- RSS company branding remains limited to designated company-branding areas.

### Centralization
- RSS Core is the central source for the shared theme catalog/configuration.
- RSS projects consume the shared catalog while retaining their own project-specific UI and branding.
- A user's selected theme should persist with the RSS account where the project supports account synchronization, and should remain available after supported reinstall/device-change flows.

## Registration and Account
- Registration requires Full Name and Email where applicable.
- Support Google/Gmail sign-in and email registration.
- Automatically detect the device email; if multiple accounts exist, allow selection.
- Terms acceptance is mandatory.
- The Create Account action must remain disabled until Terms are accepted.
- Both email registration and Google/Gmail registration must follow the RSS Core account and verification rules.
- A verification email must be sent as required.
- The user may enter the app while email verification is pending.
- Show an Email Verification Pending banner with live 24-hour countdown and Verify/Check Status/Resend actions until verified or expired.
- RSS Core controls verification and expiration.
- After successful verification, send a Welcome email from RSS Family.
- For an already registered user who signs in/returns, send a Welcome Back email instead of a new-registration Welcome email.
- Account state must support cloud and multi-device synchronization.

## Lock Screen
- Applicable RSS apps use a full-screen app-branded lock screen.
- Use the app's original logo, not the RSS company logo.
- Include clock/date, PIN indicator/keypad, biometric authentication, Forgot PIN/recovery, failed-attempt/temporary-lockout states, and configurable re-lock timeout where applicable.
- Biometric authentication should use an icon-only action, not a text button saying “Use Biometrics.”
- Support the centralized theme catalog.
- Keep the design subtle and avoid excessive glassmorphism.

## Navigation
- Use a modern slide/drawer navigation pattern where applicable.
- Large app logo at the top.
- Clear sections and meaningful icons.
- Drawer closes automatically after navigation.
- RSS company information and app version appear in the designated bottom/footer area.
- The drawer follows the selected centralized theme.

## Settings and Common Pages
Where applicable provide consistent patterns for Appearance, Notifications, Account, Cloud Sync, Premium, Backup/Restore, Privacy Policy, Terms & Conditions, About, and Contact.
- Appearance exposes the centralized RSS theme catalog.
- Theme selection must include Auto — White + Onyx.
- Auto — White + Onyx must remain neutral; it must not inherit the RSS gold brand accent.

## Premium and RSS Core
- Premium apps must provide a real Upgrade to Premium entry connected to the RSS Core entitlement/payment flow.
- Premium entitlement must be reflected after purchase, login, reinstall, or device change when the same RSS account is used.
- Use the configured RSS Core payment adapter; Payments.lk is the target adapter unless explicitly changed.
- Do not use Play Billing initially unless explicitly required.
- RSS Core and RAY are part of the RSS KIT baseline.

## Infrastructure
- Standard architecture: RSS app → RSS Core → RAY → project/cloud services.
- Prefer Cloudflare Workers for deployment/automation when GitHub Actions limits or billing constraints prevent reliable execution.
- Do not claim a build, deployment, test, or verification succeeded unless it has actually been verified.

## Repository Implementation Requirement
- RSS KIT rules are not considered implemented merely because they exist in this master repository or in a conversation.
- When an RSS KIT rule affects a project, the project's actual source code/configuration must be updated in that project's own repository.
- Completed implementation changes must be committed to the project's own repository.
- Conversation-only code or instructions do not count as a completed project change.
- After implementation, build/test/deployment verification must be performed when applicable.
- Status must distinguish clearly between: rule defined in RSS KIT, implementation committed to the project repository, and implementation verified.
- Do not claim a project is RSS KIT-compliant unless its repository implementation has actually been checked.

## Global Rule Updates
When a new requirement is explicitly declared as a global RSS requirement, add or update it in this master file. Future RSS project work must follow the latest version of these rules without requiring separate manual requirement files for every project.

When an existing global rule changes, affected project repositories must be updated as actual code/configuration work; updating this master file alone is not sufficient.

## Project Overrides
A project may override a global rule only when the user explicitly requires a project-specific behavior. The override must not be treated as a new global default unless the user explicitly says so.

## Source of Truth
Repository: riyazamra1/RSS-Brand-Kit
Master rules file: RSS_DEFAULT_RULES.md
