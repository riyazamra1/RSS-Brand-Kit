# RSS Brand Kit

Private single source of truth for Razeen Secure Solution (RSS) branding, common content, UI/UX rules, and reusable Android components.

## Purpose

RSS projects inherit these defaults unless a project explicitly overrides them.

## Core rule

**Global RSS defaults → project-specific requirements → latest explicit instruction**

Project-specific requirements override these defaults only for that project.

## Repository structure

- `brand/` — canonical RSS branding tokens and logo guidance
- `common-content/` — reusable company/About/Contact/Terms/Privacy content
- `ui-rules/` — default RSS UI/UX standards
- `android/rss-common/` — reusable Android library source
- `templates/` — implementation templates
- `docs/` — integration and versioning guidance

## Logo

The original Razeen Secure Solution logo must never be recolored, stretched, distorted, redesigned, or replaced with an AI-generated substitute.

Place the canonical logo assets under `brand/logo/`.

## Android package

The shared library namespace is:

`com.riyaz.rss.common`

RSS applications continue to use their own package IDs, following the RSS convention:

`com.riyaz.<appname>`

## Versioning

The Brand Kit and Android library use semantic versioning:

`MAJOR.MINOR.PATCH`

Do not silently upgrade production projects to a breaking Brand Kit version.
