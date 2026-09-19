# Android Integration

## Common library

Reusable Android source is under:

android/rss-common

Namespace:

com.riyaz.rss.common

## Recommended consumption

For private repositories, use a Git submodule or a controlled CI checkout of this repository. Pin production builds to a release tag or commit rather than tracking main.

The application repository remains the source of truth for project-specific code.

## Common library owns

- RSS branding
- Theme foundation
- Common company information
- Common reusable UI components
- Common design tokens

## Project repository owns

- Project logo
- Project features
- Project screens and business logic
- Project data models
- Project APIs/backends
- Project-specific settings

## Future distribution

A later phase can publish the library to a private Maven/GitHub Packages registry. Until then, source-module integration is the most transparent approach for the private RSS ecosystem.


## Slide menu usage

`RssSlideMenu` accepts an optional `Painter` for the approved RSS logo. The consuming project supplies the original logo asset; the common library does not generate or alter the logo.

The menu callback is wired through each `RssMenuItem.onClick` action. Project repositories remain responsible for navigation destinations and project-specific menu entries.
