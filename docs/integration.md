# Android Integration

## Common library

Reusable Android source is under:

\`android/rss-common\`

Namespace:

\`com.riyaz.rss.common\`

## Recommended consumption

For private repositories, use a Git submodule or a controlled CI checkout of this repository. Pin production builds to a release tag or commit rather than tracking main.

The application repository remains the source of truth for project-specific code.

## Common library owns

- RSS branding rules
- RSS KIT design tokens
- Theme foundation
- Common company information
- Common reusable UI components
- Glassmorphism slide-menu foundation
- Shared animation utilities and motion guidance

## Project repository owns

- Project logo
- Project features
- Project screens and business logic
- Project data models
- Project APIs/backends
- Project-specific settings

## Logo responsibility

The consuming project supplies its own original app/project logo for app identity. The original RSS company logo is reserved for the designated RSS company-branding areas.

## Slide menu

\`RssSlideMenu\` accepts the approved project/app logo and renders the shared glassmorphism navigation surface. Company branding should be supplied separately in the designated bottom section.

## Animation

Use the shared RSS animation helpers where applicable. Project-specific motion may override the defaults only when explicitly required.

## Future distribution

A later phase can publish the library to a private Maven/GitHub Packages registry. Until then, source-module integration is the most transparent approach for the private RSS ecosystem.
