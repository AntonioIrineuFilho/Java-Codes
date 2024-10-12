FROM openjdk:11
WORKDIR /workspace
COPY . .
RUN javac Main.java
CMD ["java", "Main"]
