# SSO Login Application

A Spring Boot application that supports multiple SSO login providers including Google, Facebook, Microsoft, GitHub, and LinkedIn.

## Prerequisites

- Java 17 or higher
- Maven
- Spring Boot 3.1.0

## Setup Instructions

1. Create application credentials for each provider:
   - Google: Create credentials in Google Cloud Console
   - Facebook: Create app in Facebook for Developers
   - Microsoft: Register app in Microsoft Azure Portal
   - GitHub: Register app in GitHub Developer Settings
   - LinkedIn: Register app in LinkedIn Developer Portal

2. Set up environment variables with your credentials:
   ```
   GOOGLE_CLIENT_ID=your_google_client_id
   GOOGLE_CLIENT_SECRET=your_google_client_secret
   FACEBOOK_CLIENT_ID=your_facebook_client_id
   FACEBOOK_CLIENT_SECRET=your_facebook_client_secret
   MICROSOFT_CLIENT_ID=your_microsoft_client_id
   MICROSOFT_CLIENT_SECRET=your_microsoft_client_secret
   GITHUB_CLIENT_ID=your_github_client_id
   GITHUB_CLIENT_SECRET=your_github_client_secret
   LINKEDIN_CLIENT_ID=your_linkedin_client_id
   LINKEDIN_CLIENT_SECRET=your_linkedin_client_secret
   ```

3. Build and run the application:
   ```
   mvn clean install
   mvn spring-boot:run
   ```

4. Access the application at: http://localhost:8080

## Features

- Multiple SSO login providers
- Secure OAuth2 authentication
- User profile display
- Logout functionality
- Responsive UI using Bootstrap

## Security Notes

- Never commit your client secrets to version control
- Use environment variables for storing sensitive information
- Ensure your application's redirect URIs match exactly with what's configured in each provider's dashboard
