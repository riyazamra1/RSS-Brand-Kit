# RSS Brand Kit

Private single source of truth for Razeen Secure Solution (RSS) branding, common content, UI/UX rules, and reusable Android components.

## Purpose

RSS projects inherit these defaults unless a project explicitly overrides them.

## Priority

**Global RSS defaults → project-specific requirements → latest explicit instruction**

Project-specific requirements override these defaults only for that project.

## Core RSS KIT standards

- Modern, premium, professional, lightweight UI.
- Every app uses its own original project/app logo for app identity.
- Original RSS company logo is preserved unchanged and used only in designated company-branding areas.
- **Animation is the default throughout the complete app experience.**
- **Slide navigation uses a modern glassmorphism treatment.**
- Light / Dark / System appearance applies consistently across the complete app.
- Meaningful colorful icons are used throughout appropriate app content.
- Standard Settings, About, Contact, Privacy Policy, and Terms & Conditions patterns are provided.
- RSS Core and RAY standards are part of the RSS KIT baseline.
- Accessibility, responsive layouts, performance, and readable contrast are required.

## Repository structure

- \`brand/\` — canonical RSS branding tokens and logo guidance
- \`common-content/\` — reusable company/About/Contact/Terms/Privacy content
- \`ui-rules/\` — default RSS UI/UX standards
- \`android/rss-common/\` — reusable Android library source
- \`templates/\` — implementation templates
- \`docs/\` — integration and versioning guidance

## Logo

The original Razeen Secure Solution logo must never be recolored, stretched, distorted, redesigned, or replaced with an AI-generated substitute.

## Android package

Shared library namespace: \`com.riyaz.rss.common\`

RSS applications continue to use their own package IDs following:

\`com.riyaz.<appname>\`

## Versioning

The Brand Kit and Android library use semantic versioning:

\`MAJOR.MINOR.PATCH\`

Do not silently upgrade production projects to a breaking Brand Kit version.
