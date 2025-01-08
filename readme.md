This README will describe the frontend Java application for IronGuard, detailing how to install and run the web interface.
# IronGuard WebKit

**IronGuard WebKit** is the Java-based frontend component of the IronGuard system, providing a web interface to manage, monitor, and interact with sub-servers. It communicates with the IronGuard Service and allows users to control the servers via a graphical interface.

## Features

- **Web Interface**: Provides an easy-to-use UI to interact with IronGuard Service.
- **Metrics Dashboard**: View real-time system metrics collected by Prometheus.
- **Server Management**: Start, stop, and configure servers via the web UI.
- **WebSocket Communication**: Real-time communication with the IronGuard Service using WebSockets.

## Requirements

- **Java 11** or higher (OpenJDK or Oracle JDK)
- **Gradle** (for dependency management and build)
- **A web browser** (e.g., Chrome, Firefox)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ImagineForgee/IronGuard.git
   ```

2. Navigate into the project directory:
    
    ```bash
    cd IronGuard
    ```
    
3. Build the project using Gradle:
    
    ```bash
    gradle build
    ```
    
4. Run the frontend application:

###### Windows
```bash
./run.bat
```
###### Linux/Ubuntu

```
run.sh
```
    
5. Open the web interface in your browser at `http://localhost:8081`.
    

## Usage

Once the web interface is running, you can:

- Monitor server metrics like CPU and memory usage.
- Start, stop, and manage sub-servers directly from the UI.
- Access logs, status reports, and more.

### WebSocket Integration

The frontend communicates with the IronGuard Service through WebSockets. During the initial handshake, the client establishes a secure WebSocket connection to the service, allowing for real-time communication.

For more information, refer to the [WebSocket Handshake Documentation](https://github.com/ImagineForgee/IronGuard/wiki/Three-Way-Handshake-WebSockets).

## Contributing

We welcome contributions to improve IronGuard WebKit. If you would like to contribute:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add feature'`).
4. Push to your branch (`git push origin feature-branch`).
5. Open a pull request.

Please refer to our [contributing guidelines](https://github.com/ImagineForgee/IronGuard/wiki/CONTRIBUTING) for more information.

## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/ImagineForgee/IronGuard?tab=MIT-1-ov-file) file for details.

---

Feel free to open issues or contribute to improve IronGuard WebKit. If you encounter any problems, don't hesitate to [open an issue](https://github.com/ImagineForgee/IronGuard/issues).

