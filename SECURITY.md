# RSS KIT Security Baseline

RSS KIT is a shared standard used by multiple RSS applications. A weakness in the shared kit can propagate to many projects.

## Rules

- Never store production API keys, access tokens, passwords, private keys, signing secrets, or OAuth credentials in the Brand Kit.
- Shared Android components must never hard-code RSS Core or RAY credentials.
- Apps authenticate to RSS Core using the project's supported secure account/license flow; control-plane tokens remain server-side.
- Do not place secrets in logs, screenshots, sample configuration, demo data, documentation, or committed build files.
- Treat all network responses, deep links, clipboard content, downloaded content, and external URLs as untrusted input.
- Validate and bound user-controlled strings before persistence or network use.
- Use HTTPS/TLS for production endpoints and do not disable certificate validation.
- Do not add unrestricted shell execution, dynamic code loading, or insecure WebView bridges to shared components.
- Preserve the original RSS branding assets; security changes must not require altering the canonical logo assets.

## Release gate

Before a shared RSS KIT release, verify that no credentials are present, dependencies are reviewed, Android manifests do not expose unnecessary components, exported components are intentional, and network/security configuration remains production-safe.

Automatic recovery must never weaken authentication or security controls.
