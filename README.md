# Weather service

## Build

### Multi Stage Dockerfile

```console
docker build -t weather:1 .
```

### Single Stage Dockerfile

```console
docker build -t weather:1 -f single-stage.dockerfile .
```
