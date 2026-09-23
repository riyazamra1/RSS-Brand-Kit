# RSS Global Account & Deployment Standard

Status: Required RSS KIT standard for all RSS projects. This document defines the mandatory target; project implementation must be individually audited and verified before being marked compliant.

## Account and registration
- Use RSS Core as the authoritative identity/account service.
- Support Google/Gmail sign-in and Email registration wherever account functionality applies.
- Email registration sends verification through RSS Core. Allow initial app access while verification is pending.
- Persist the verification start/expiry timestamp server-side. Show a prominent home-screen “Email Verification Pending” state with a live 24-hour countdown, Verify/Check Status, and Resend Verification Email actions.
- Keep pending state across app restarts. Remove it immediately after successful verification. Apply RSS Core's expired-verification flow after 24 hours.
- Google-authenticated accounts that RSS Core confirms as verified must not see the pending-verification state.
- RSS Downloader's registration/account configuration is the functional reference, not its UI. Preserve each project's own approved UI and app logo.

## Sync and Premium
- Use the same RSS Core account for cloud sync, restore after reinstall, and multi-device sync where the project has syncable data.
- Keep app data scoped to the authenticated RSS account and project; never leak data across users or projects.
- Premium-enabled projects must provide a functional Upgrade to Premium entry connected to RSS Core's configured catalog/checkout and entitlement checks.
- Premium entitlement must follow the same RSS account across supported devices and reinstalls. Do not display a purchase as successful until entitlement is confirmed.
- Never embed privileged RSS Core/API secrets in client apps.

## Deployment fallback
1. Use the normal GitHub workflow while available.
2. If GitHub rate/usage limits or a GitHub deployment blockage prevents progress, do not wait or repeatedly retry without cause. Immediately use the existing Cloudflare Workers/RSS Core deployment path for the affected service, provided authenticated access, configuration, and a safe deployable artifact are available.
3. Do not claim fallback deployment succeeded unless the Worker deployment result and relevant health/functional checks are verified.
4. If Cloudflare credentials/configuration or deployable artifacts are unavailable, record the exact blocker; do not fabricate a deployment or silently substitute infrastructure.
5. Keep secrets in platform-managed secret storage, not source files.

## Rollout and verification
- Audit each RSS repository independently; do not copy another app's UI or project-specific logic.
- Implement shared identity/verification/entitlement behavior through RSS Core contracts where possible; use thin app adapters.
- For each project, record repository/commit, implemented components, build/test results, RSS Core integration checks, and deployment/health verification.
- A global rule being documented does not mean every repository is already implemented. Mark each project compliant only after evidence-based verification.
